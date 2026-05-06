package com.appvillis.feature_nicegram_client

import android.content.Context

object NicegramOnboardingHelper {
    @JvmStatic fun isOnboardingCompleted(context: Context): Boolean = true
    @JvmStatic fun markOnboardingCompleted(context: Context) {}
    @JvmStatic fun shouldShowOnboarding(context: Context): Boolean = false
}
