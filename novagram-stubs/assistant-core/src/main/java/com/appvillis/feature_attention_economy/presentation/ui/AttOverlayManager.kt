package com.appvillis.feature_attention_economy.presentation.ui

import android.app.Activity

object AttOverlayManager {
    fun getOverlayVisible(): Boolean = false
    fun removeOverlay(activity: Activity) {}
    fun setNavigator(navigator: AttOverlayNavigator) {}

    interface AttOverlayNavigator {
        fun openAtt()
    }
}
