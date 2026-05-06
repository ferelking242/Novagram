package com.appvillis.core_resources

object MarketConsts {
    const val MARKET_GOOGLE = "google"
    const val MARKET_HUAWEI = "huawei"
    const val MARKET_STANDALONE = "standalone"
    const val MARKET_HOCKEY_APP = "hockeyapp"
    const val CURRENT_MARKET = MARKET_GOOGLE

    @JvmField var isHuawei: Boolean = false

    @JvmStatic fun setHuawei(value: Boolean) { isHuawei = value }
    @JvmStatic fun isHuawei(): Boolean = isHuawei
}
