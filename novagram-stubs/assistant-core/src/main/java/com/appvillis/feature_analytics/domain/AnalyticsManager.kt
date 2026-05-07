package com.appvillis.feature_analytics.domain

import com.appvillis.feature_analytics.data.AnalyticsEvent
import com.appvillis.feature_analytics.data.AnalyticsTrackEvent
import com.appvillis.feature_analytics.data.AnalyticsValue

interface AnalyticsManager {
    fun logEvent(name: String)
    fun logEvent(name: String, params: Map<String, AnalyticsValue>)
    fun logEvent(event: AnalyticsEvent)
    fun logEvent(event: AnalyticsTrackEvent)
    fun logEventOncePerSession(name: String)
}
