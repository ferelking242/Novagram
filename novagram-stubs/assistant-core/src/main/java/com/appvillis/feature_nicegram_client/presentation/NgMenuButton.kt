package com.appvillis.feature_nicegram_client.presentation

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout

open class NgMenuButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    bgColor: Int = 0,
    iconColor: Int = 0
) : FrameLayout(context, attrs) {
    fun setOnClickCallback(callback: Runnable) {}
    fun updateTheme() {}
    fun setNgInChatOverlayView(view: View) {}
    fun onAiAnalysisClick(callback: Runnable) {}
    fun onAiBotClick(callback: Runnable) {}
    fun onWalletBotClick(callback: Runnable) {}
    fun getMainButtonSize(): Int = 0
}
