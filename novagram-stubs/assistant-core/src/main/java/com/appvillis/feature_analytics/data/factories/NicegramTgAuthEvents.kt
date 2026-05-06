package com.appvillis.feature_analytics.data.factories

import com.appvillis.feature_analytics.data.AnalyticsEvent

object NicegramTgAuthEvents {
    @JvmStatic fun authStarted(): AnalyticsEvent = AnalyticsEvent("auth_started")
    @JvmStatic fun authCompleted(): AnalyticsEvent = AnalyticsEvent("auth_completed")
    @JvmStatic fun authFailed(): AnalyticsEvent = AnalyticsEvent("auth_failed")
    @JvmStatic fun phoneEntered(): AnalyticsEvent = AnalyticsEvent("phone_entered")
    @JvmStatic fun codeEntered(): AnalyticsEvent = AnalyticsEvent("code_entered")
    @JvmStatic fun nicegramTgauthSuccess(): AnalyticsEvent = AnalyticsEvent("nicegram_tgauth_success")
}
