package com.appvillis.nicegram_wallet.wallet_tonconnect.domain

import android.content.Context

class TcDeeplinkManager {
    fun handleDeeplink(context: Context, url: String): Boolean = false
    fun hasPendingDeeplink(): Boolean = false
    fun processPendingDeeplink(context: Context) {}
    fun processLink(link: String) {}
}
