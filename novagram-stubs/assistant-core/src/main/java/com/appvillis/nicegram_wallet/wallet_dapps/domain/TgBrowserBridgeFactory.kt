package com.appvillis.nicegram_wallet.wallet_dapps.domain

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope

class TgBrowserBridgeFactory {
    fun create(url: String): Any? = null
    fun createBridge(webView: Any?): Any? = null
    fun createBrowserBridge(scope: CoroutineScope): TgBrowserBridge = TgBrowserBridge()

    class TgBrowserBridge {
        fun init() {}
        fun onIncomingRequestEvm(request: Any?, callback: Any?) {}
        fun onIncomingRequestTon(request: Any?) {}
        fun onIncomingRequestSolana(request: Any?, callback: Any?) {}
    }

    class BrowserScope : CoroutineScope by MainScope()
}
