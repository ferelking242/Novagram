package com.appvillis.feature_analytics.domain

import com.appvillis.feature_analytics.data.AnalyticsEvent
import com.appvillis.feature_analytics.data.AnalyticsValue

interface AnalyticsManager {
    fun logEvent(name: String)
    fun logEvent(name: String, params: Map<String, AnalyticsValue>)
    fun logEvent(event: AnalyticsEvent)
}
