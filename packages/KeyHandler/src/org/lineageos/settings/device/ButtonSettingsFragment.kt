/*
 * SPDX-FileCopyrightText: 2021-2025 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.settings.device

import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import androidx.preference.EditTextPreference
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.SwitchPreferenceCompat
import com.android.settingslib.widget.SettingsBasePreferenceFragment

class ButtonSettingsFragment : SettingsBasePreferenceFragment(), Preference.OnPreferenceChangeListener {
    private lateinit var topPositionPref: ListPreference
    private lateinit var middlePositionPref: ListPreference
    private lateinit var bottomPositionPref: ListPreference

    private lateinit var emojiTopPref: EditTextPreference
    private lateinit var emojiMiddlePref: EditTextPreference
    private lateinit var emojiBottomPref: EditTextPreference

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.button_panel, rootKey)

        topPositionPref = findPreference("config_top_position")!!
        middlePositionPref = findPreference("config_middle_position")!!
        bottomPositionPref = findPreference("config_bottom_position")!!

        emojiTopPref = findPreference("config_emoji_top")!!
        emojiMiddlePref = findPreference("config_emoji_middle")!!
        emojiBottomPref = findPreference("config_emoji_bottom")!!

        // Restore position values from Settings.System
        val resolver = requireContext().contentResolver
        Settings.System.getString(resolver, "config_top_position")?.let { topPositionPref.value = it }
        Settings.System.getString(resolver, "config_middle_position")?.let { middlePositionPref.value = it }
        Settings.System.getString(resolver, "config_bottom_position")?.let { bottomPositionPref.value = it }

        // Restore mute_media and show_dialog from Settings.System
        findPreference<SwitchPreferenceCompat>("config_mute_media")?.isChecked =
            Settings.System.getInt(resolver, "config_mute_media", 0) != 0
        findPreference<SwitchPreferenceCompat>("config_show_dialog")?.isChecked =
            Settings.System.getInt(resolver, "config_show_dialog", 1) != 0

        topPositionPref.onPreferenceChangeListener = this
        middlePositionPref.onPreferenceChangeListener = this
        bottomPositionPref.onPreferenceChangeListener = this

        findPreference<SwitchPreferenceCompat>("config_alert_slider_island")?.onPreferenceChangeListener = this
        findPreference<SwitchPreferenceCompat>("config_alert_slider_glass")?.onPreferenceChangeListener = this
        findPreference<SwitchPreferenceCompat>("config_alert_slider_hide_label")?.onPreferenceChangeListener = this
        findPreference<SwitchPreferenceCompat>("config_mute_media")?.onPreferenceChangeListener = this
        findPreference<SwitchPreferenceCompat>("config_show_dialog")?.onPreferenceChangeListener = this
        emojiTopPref.onPreferenceChangeListener = this
        emojiMiddlePref.onPreferenceChangeListener = this
        emojiBottomPref.onPreferenceChangeListener = this

        // Restore switch states from Settings.System
        findPreference<SwitchPreferenceCompat>("config_alert_slider_island")?.isChecked =
            Settings.System.getInt(resolver, "config_alert_slider_island", 0) != 0
        findPreference<SwitchPreferenceCompat>("config_alert_slider_glass")?.isChecked =
            Settings.System.getInt(resolver, "config_alert_slider_glass", 0) != 0
        findPreference<SwitchPreferenceCompat>("config_alert_slider_hide_label")?.isChecked =
            Settings.System.getInt(resolver, "config_alert_slider_hide_label", 0) != 0
    }

    override fun onResume() {
        super.onResume()
        // Sync emoji summaries to show currently active emoji for each position
        syncEmojiSummaries()
    }

    private fun syncEmojiSummaries() {
        val resolver = requireContext().contentResolver
        listOf(
            emojiTopPref to "config_emoji_top",
            emojiMiddlePref to "config_emoji_middle",
            emojiBottomPref to "config_emoji_bottom"
        ).forEach { (pref, key) ->
            val saved = Settings.System.getString(resolver, key)
            if (!saved.isNullOrEmpty()) {
                pref.summary = saved
                pref.text = saved  // keep EditText field in sync
            } else {
                pref.summary = "Not set"
                pref.text = ""
            }
        }
    }

    override fun onPreferenceChange(preference: Preference, newValue: Any?): Boolean {
        val resolver = requireContext().contentResolver

        when (preference.key) {
            "config_top_position", "config_middle_position", "config_bottom_position" -> {
                val value = newValue as? String ?: return true
                val (otherPref1, otherPref2) = when (preference.key) {
                    "config_top_position" -> Pair(middlePositionPref, bottomPositionPref)
                    "config_middle_position" -> Pair(topPositionPref, bottomPositionPref)
                    "config_bottom_position" -> Pair(topPositionPref, middlePositionPref)
                    else -> return true
                }

                if (value == otherPref1.value || value == otherPref2.value) {
                    Toast.makeText(requireContext(), R.string.alert_slider_action_already_mapped, Toast.LENGTH_SHORT).show()
                    return false
                }
                // Write to Settings.System for instant cross-process access
                Settings.System.putString(resolver, preference.key, value)
            }
            "config_alert_slider_island", "config_alert_slider_glass", "config_alert_slider_hide_label" -> {
                val value = if (newValue as Boolean) 1 else 0
                Settings.System.putInt(resolver, preference.key, value)
            }
            "config_mute_media", "config_show_dialog" -> {
                val value = if (newValue as Boolean) 1 else 0
                Settings.System.putInt(resolver, preference.key, value)
            }
            "config_emoji_top", "config_emoji_middle", "config_emoji_bottom" -> {
                val emoji = newValue as String
                // Enforce emoji/symbol only (reject normal letters/digits)
                if (emoji.any { it.isLetterOrDigit() }) {
                    Toast.makeText(requireContext(), "Only emojis and symbols are allowed!", Toast.LENGTH_SHORT).show()
                    return false
                }
                Settings.System.putString(resolver, preference.key, emoji)
                // Update summary immediately so user sees their emoji
                preference.summary = if (emoji.isNotEmpty()) emoji else "Not set"
            }
        }

        return true
    }
}
