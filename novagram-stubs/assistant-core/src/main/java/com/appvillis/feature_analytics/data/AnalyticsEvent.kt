package com.appvillis.feature_analytics.data

data class AnalyticsEvent(
    val name: String,
    val params: Map<String, AnalyticsValue> = emptyMap()
)
