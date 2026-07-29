/*
 * SPDX-FileCopyrightText: 2019 CypherOS
 * SPDX-FileCopyrightText: 2014-2020 Paranoid Android
 * SPDX-FileCopyrightText: 2023-2026 The LineageOS Project
 * SPDX-FileCopyrightText: 2023 Yet Another AOSP Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.settings.device

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.PixelFormat
import android.graphics.drawable.Animatable2
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.media.AudioManager
import android.provider.Settings
import android.view.Gravity
import android.view.Surface
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.view.animation.OvershootInterpolator
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

import android.graphics.Outline
import android.view.ViewOutlineProvider
import com.android.internal.graphics.drawable.BackgroundBlurDrawable

class AlertSliderDialog(private val context: Context) :
    Dialog(context, R.style.alert_slider_theme) {
    private val dialogView by lazy { findViewById<LinearLayout>(R.id.alert_slider_dialog)!! }
    private val frameView by lazy { findViewById<ViewGroup>(R.id.alert_slider_view)!! }
    private val iconView by lazy { findViewById<ImageView>(R.id.alert_slider_icon)!! }
    private val textView by lazy { findViewById<TextView>(R.id.alert_slider_text)!! }
    private val emojiView by lazy { findViewById<TextView>(R.id.alert_slider_emoji_view)!! }

    private val rotation: Int = context.getDisplay().getRotation()
    private val isLandscape = rotation == Surface.ROTATION_90 || rotation == Surface.ROTATION_270
    private val flip = context.resources.getBoolean(R.bool.alert_slider_dialog_left)

    private val length: Int
    private val xPos: Int
    private val yPos: Int

    private var isAnimating = false
    private var animator = ValueAnimator()
    private var isBlurEnabled = false
    private var blurDrawable: BackgroundBlurDrawable? = null

    init {
        window?.let {
            it.requestFeature(Window.FEATURE_NO_TITLE)
            it.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            it.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
            it.addFlags(
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or
                    WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL or
                    WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH or
                    WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED
            )
            it.addPrivateFlags(WindowManager.LayoutParams.PRIVATE_FLAG_TRUSTED_OVERLAY)
            it.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING)
            it.setType(WindowManager.LayoutParams.TYPE_VOLUME_OVERLAY)
            it.attributes =
                it.attributes.apply {
                    format = PixelFormat.TRANSLUCENT
                    layoutInDisplayCutoutMode =
                        WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS
                    title = TAG
                }
            it.setElevation(0f)
            it.decorView.elevation = 0f
            it.decorView.clipToOutline = false
        }

        setCanceledOnTouchOutside(false)
        setContentView(R.layout.alert_slider_dialog)

        dialogView.elevation = 0f
        dialogView.background = null
        dialogView.clipToOutline = false

        frameView.elevation = 0f
        frameView.clipToOutline = true
        frameView.outlineProvider = ViewOutlineProvider.BACKGROUND

        frameView.addOnAttachStateChangeListener(object : View.OnAttachStateChangeListener {
            override fun onViewAttachedToWindow(v: View) {
                val nightMode = (context.resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK) == android.content.res.Configuration.UI_MODE_NIGHT_YES
                updateBlurBackground(isBlurEnabled, nightMode)
            }
            override fun onViewDetachedFromWindow(v: View) {}
        })

        val res = context.resources
        val fraction = res.getFraction(R.fraction.alert_slider_dialog_y, 1, 1)
        val widthPixels = res.displayMetrics.widthPixels
        val heightPixels = res.displayMetrics.heightPixels
        val pads = dialogView.paddingTop * 2
        length =
            if (isLandscape) res.getDimension(R.dimen.alert_slider_dialog_width).toInt()
            else res.getDimension(R.dimen.alert_slider_dialog_height).toInt()
        val hv = (length + pads) * 0.5

        val marginPx = res.getDimensionPixelSize(R.dimen.alert_slider_container_padding)
        xPos =
            if (isLandscape) (widthPixels * fraction - hv).toInt()
            else marginPx
        yPos =
            if (isLandscape) marginPx
            else (heightPixels * fraction - hv).toInt()

        window?.let {
            it.attributes =
                it.attributes.apply {
                    gravity =
                        when (rotation) {
                            Surface.ROTATION_0 ->
                                if (flip) Gravity.TOP or Gravity.LEFT
                                else Gravity.TOP or Gravity.RIGHT
                            Surface.ROTATION_90 ->
                                if (flip) Gravity.BOTTOM or Gravity.LEFT
                                else Gravity.TOP or Gravity.LEFT
                            Surface.ROTATION_270 ->
                                if (flip) Gravity.TOP or Gravity.RIGHT
                                else Gravity.BOTTOM or Gravity.RIGHT
                            else ->
                                if (flip) Gravity.BOTTOM or Gravity.LEFT
                                else Gravity.TOP or Gravity.LEFT
                        }
                    x = xPos
                    y = yPos
                }
        }
    }

    fun refreshBlur() {
        window?.let {
            it.setBackgroundBlurRadius(0)
            it.clearFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND)
        }
    }

    private fun updateBlurBackground(blurPopup: Boolean, nightMode: Boolean) {
        dialogView.background = null
        dialogView.elevation = 0f
        dialogView.clipToOutline = false
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        window?.setElevation(0f)
        window?.decorView?.elevation = 0f
        window?.decorView?.clipToOutline = false
        window?.setBackgroundBlurRadius(0)

        val radiusPx = context.resources.getDimension(R.dimen.alert_slider_corner_radius)

        if (blurPopup) {
            val vri = frameView.viewRootImpl
            if (vri != null) {
                val drawable = blurDrawable ?: vri.createBackgroundBlurDrawable().also { blurDrawable = it }
                val h = frameView.height.toFloat()
                val r = if (h > 0) h / 2f else radiusPx
                drawable.setCornerRadius(r)
                drawable.setBlurRadius(BLUR_RADIUS)
                drawable.setColor(if (nightMode) Color.argb(160, 24, 24, 24) else Color.argb(170, 245, 245, 247))
                frameView.background = drawable
            } else {
                val bgDrawable = context.getDrawable(R.drawable.alert_slider_bg)?.mutate() as? android.graphics.drawable.GradientDrawable
                if (bgDrawable != null) {
                    bgDrawable.cornerRadius = radiusPx
                    bgDrawable.setColor(if (nightMode) Color.argb(160, 24, 24, 24) else Color.argb(170, 245, 245, 247))
                    frameView.background = bgDrawable
                }
            }
        } else {
            val bgDrawable = context.getDrawable(R.drawable.alert_slider_bg)?.mutate() as? android.graphics.drawable.GradientDrawable
            if (bgDrawable != null) {
                bgDrawable.cornerRadius = radiusPx
                bgDrawable.setColor(if (nightMode) Color.parseColor("#1C1B1F") else Color.WHITE)
                frameView.background = bgDrawable
            }
        }

        frameView.outlineProvider = ViewOutlineProvider.BACKGROUND
        frameView.clipToOutline = true
        frameView.elevation = 0f

        frameView.post {
            val h = frameView.height.toFloat()
            if (h > 0) {
                val capsuleRadius = h / 2f
                blurDrawable?.setCornerRadius(capsuleRadius)
                (frameView.background as? android.graphics.drawable.GradientDrawable)?.cornerRadius = capsuleRadius
                frameView.invalidateOutline()
            }
        }
    }

    @Synchronized
    fun setState(position: Int, ringerMode: Int) {
        val resolver = context.contentResolver
        val islandMode = Settings.System.getInt(resolver, "config_alert_slider_island", 0) != 0
        val blurPopup = Settings.System.getInt(resolver, "config_alert_slider_glass", 0) != 0
        val hideLabel = Settings.System.getInt(resolver, "config_alert_slider_hide_label", 0) != 0
        isBlurEnabled = blurPopup
        refreshBlur()

        applyUiContent(position, ringerMode, hideLabel, blurPopup)

        val delta =
            length *
                when (position) {
                    KeyHandler.POSITION_TOP -> -1
                    KeyHandler.POSITION_BOTTOM -> 1
                    else -> 0
                }

        if (islandMode) {
            val statusBarHeight = run {
                val resId = context.resources.getIdentifier("status_bar_height", "dimen", "android")
                if (resId > 0) context.resources.getDimensionPixelSize(resId) else 96
            }
            val islandMarginPx = context.resources.getDimensionPixelSize(R.dimen.alert_slider_container_padding)
            window?.let {
                it.attributes = it.attributes.apply {
                    gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
                    x = 0
                    y = statusBarHeight + (islandMarginPx / 2)
                }
            }
            dialogView.background = null
            frameView.background = null
        } else {
            window?.let {
                it.attributes = it.attributes.apply {
                    gravity = when (rotation) {
                        Surface.ROTATION_0 -> if (flip) Gravity.TOP or Gravity.LEFT else Gravity.TOP or Gravity.RIGHT
                        Surface.ROTATION_90 -> if (flip) Gravity.BOTTOM or Gravity.LEFT else Gravity.TOP or Gravity.LEFT
                        Surface.ROTATION_270 -> if (flip) Gravity.TOP or Gravity.RIGHT else Gravity.BOTTOM or Gravity.RIGHT
                        else -> if (flip) Gravity.BOTTOM or Gravity.LEFT else Gravity.TOP or Gravity.LEFT
                    }
                    x = xPos + if (isLandscape) delta else 0
                    y = yPos + if (isLandscape) 0 else delta
                }
            }
        }

        val nightMode = (context.resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK) == android.content.res.Configuration.UI_MODE_NIGHT_YES
        updateBlurBackground(blurPopup, nightMode)


        if (hideLabel) {
            textView.visibility = View.GONE
        } else {
            textView.visibility = View.VISIBLE
            textView.setText(
                when (ringerMode) {
                    AudioManager.RINGER_MODE_SILENT -> R.string.alert_slider_mode_silent
                    AudioManager.RINGER_MODE_VIBRATE -> R.string.alert_slider_mode_vibration
                    AudioManager.RINGER_MODE_NORMAL -> R.string.alert_slider_mode_normal
                    KeyHandler.ZEN_PRIORITY_ONLY -> R.string.alert_slider_mode_dnd_priority_only
                    KeyHandler.ZEN_TOTAL_SILENCE -> R.string.alert_slider_mode_dnd_total_silence
                    KeyHandler.ZEN_ALARMS_ONLY -> R.string.alert_slider_mode_dnd_alarms_only
                    KeyHandler.TORCH_ON -> R.string.alert_slider_mode_torch_on
                    KeyHandler.TORCH_OFF -> R.string.alert_slider_mode_torch_off
                    else -> R.string.alert_slider_mode_none
                }
            )
            val textColor = if (blurPopup) {
                if (nightMode) Color.WHITE else Color.parseColor("#1A1A1A")
            } else {
                if (nightMode) Color.WHITE else Color.BLACK
            }
            textView.setTextColor(textColor)
        }
    }



    private fun applyUiContent(position: Int, ringerMode: Int, hideLabel: Boolean, blurActive: Boolean) {
        val resolver = context.contentResolver
        val posKey = when (position) {
            KeyHandler.POSITION_TOP -> "top"
            KeyHandler.POSITION_MIDDLE -> "middle"
            KeyHandler.POSITION_BOTTOM -> "bottom"
            else -> null
        }

        val rawEmoji = posKey?.let { Settings.System.getString(resolver, "config_emoji_$it") }
        val emoji = rawEmoji?.takeIf { it.isNotEmpty() }

        (iconView.drawable as? AnimatedVectorDrawable)?.stop()

        when {
            emoji != null -> {
                iconView.visibility = View.GONE
                emojiView.visibility = View.VISIBLE
                emojiView.text = emoji
                animateEmoji(emojiView)
            }
            else -> {
                emojiView.visibility = View.GONE
                iconView.visibility = View.VISIBLE
                applyDefaultIcon(ringerMode, blurActive)
            }
        }
    }

    private fun applyDefaultIcon(ringerMode: Int, blurActive: Boolean) {
        val animDrawableRes = when (ringerMode) {
            AudioManager.RINGER_MODE_VIBRATE -> R.drawable.ic_volume_ringer_vibrate_anim
            AudioManager.RINGER_MODE_NORMAL -> R.drawable.ic_volume_ringer_anim
            AudioManager.RINGER_MODE_SILENT -> R.drawable.ic_volume_ringer_mute_anim
            KeyHandler.ZEN_PRIORITY_ONLY -> R.drawable.ic_notifications_alert_anim
            KeyHandler.ZEN_TOTAL_SILENCE -> R.drawable.ic_notifications_silence_anim
            KeyHandler.ZEN_ALARMS_ONLY -> R.drawable.ic_alarm_anim
            KeyHandler.TORCH_ON -> R.drawable.ic_torch_on_anim
            KeyHandler.TORCH_OFF -> R.drawable.ic_torch_off_anim
            else -> R.drawable.ic_snow_anim
        }
        val staticDrawableRes = when (ringerMode) {
            AudioManager.RINGER_MODE_SILENT -> R.drawable.ic_volume_ringer_mute
            AudioManager.RINGER_MODE_VIBRATE -> R.drawable.ic_volume_ringer_vibrate
            AudioManager.RINGER_MODE_NORMAL -> R.drawable.ic_volume_ringer
            KeyHandler.ZEN_PRIORITY_ONLY -> R.drawable.ic_notifications_alert
            KeyHandler.ZEN_TOTAL_SILENCE -> R.drawable.ic_notifications_silence
            KeyHandler.ZEN_ALARMS_ONLY -> R.drawable.ic_alarm
            KeyHandler.TORCH_ON -> R.drawable.ic_torch_on
            KeyHandler.TORCH_OFF -> R.drawable.ic_torch_off
            else -> R.drawable.ic_snow
        }

        if (animDrawableRes != 0) {
            iconView.setImageResource(animDrawableRes)
            // Tint for blur mode readability
            if (blurActive) {
                val nightMode = (context.resources.configuration.uiMode
                    and android.content.res.Configuration.UI_MODE_NIGHT_MASK) ==
                    android.content.res.Configuration.UI_MODE_NIGHT_YES
                iconView.setColorFilter(
                    if (nightMode) Color.WHITE else Color.parseColor("#1A1A1A")
                )
            } else {
                val nightMode = (context.resources.configuration.uiMode
                    and android.content.res.Configuration.UI_MODE_NIGHT_MASK) ==
                    android.content.res.Configuration.UI_MODE_NIGHT_YES
                iconView.setColorFilter(
                    if (nightMode) Color.WHITE else Color.BLACK
                )
            }
            (iconView.drawable as? AnimatedVectorDrawable)?.let { avd ->
                avd.clearAnimationCallbacks()
                avd.registerAnimationCallback(object : Animatable2.AnimationCallback() {
                    override fun onAnimationEnd(drawable: Drawable) {
                        iconView.post { avd.start() }
                    }
                })
                avd.start()
            }
        } else {
            iconView.setImageResource(staticDrawableRes)
            if (blurActive) {
                val nightMode = (context.resources.configuration.uiMode
                    and android.content.res.Configuration.UI_MODE_NIGHT_MASK) ==
                    android.content.res.Configuration.UI_MODE_NIGHT_YES
                iconView.setColorFilter(
                    if (nightMode) Color.WHITE else Color.parseColor("#1A1A1A")
                )
            } else {
                val nightMode = (context.resources.configuration.uiMode
                    and android.content.res.Configuration.UI_MODE_NIGHT_MASK) ==
                    android.content.res.Configuration.UI_MODE_NIGHT_YES
                iconView.setColorFilter(
                    if (nightMode) Color.WHITE else Color.BLACK
                )
            }
        }
    }



    private fun animateEmoji(view: TextView) {
        view.scaleX = 0.4f
        view.scaleY = 0.4f
        view.alpha = 0f

        val scaleX = ObjectAnimator.ofFloat(view, "scaleX", 0.4f, 1.15f, 0.95f, 1f)
        val scaleY = ObjectAnimator.ofFloat(view, "scaleY", 0.4f, 1.15f, 0.95f, 1f)
        val alpha = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        AnimatorSet().apply {
            playTogether(scaleX, scaleY, alpha)
            duration = 400
            interpolator = OvershootInterpolator(1.0f)
            start()
        }
    }

    companion object {
        private const val TAG = "AlertSliderDialog"
        private const val BLUR_RADIUS = 100
    }
}
