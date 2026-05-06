package com.appvillis.feature_analytics.data

sealed class AnalyticsValue {
    data class StringVal(val value: String) : AnalyticsValue()
    data class BooleanVal(val value: Boolean) : AnalyticsValue()
    data class IntVal(val value: Int) : AnalyticsValue()
    data class LongVal(val value: Long) : AnalyticsValue()
    data class FloatVal(val value: Float) : AnalyticsValue()
}
