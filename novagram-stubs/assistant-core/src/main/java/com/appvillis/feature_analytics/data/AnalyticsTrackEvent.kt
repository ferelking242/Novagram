package com.appvillis.feature_analytics.data

data class AnalyticsTrackEvent(
    val name: String,
    val params: Map<String, AnalyticsValue> = emptyMap()
)
