package com.appvillis.core_markets

interface MarketFeatureFlagsProvider {
    val isHuawei: Boolean get() = false
    val supportsIap: Boolean get() = true
    val canShowAds: Boolean get() = false
}
