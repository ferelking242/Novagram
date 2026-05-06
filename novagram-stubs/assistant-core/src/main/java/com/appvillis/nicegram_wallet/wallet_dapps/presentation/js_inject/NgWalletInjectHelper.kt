package com.appvillis.nicegram_wallet.wallet_dapps.presentation.js_inject

import android.webkit.WebView

object NgWalletInjectHelper {
    @JvmStatic fun inject(webView: WebView, url: String) {}
    @JvmStatic fun handleMessage(webView: WebView, message: String): Boolean = false
    @JvmStatic fun createBrowserEventsReceiver(webView: WebView): Any = Object()
    @JvmStatic fun onWebViewInit(
        webView: WebView,
        tag: String,
        evmCallback: Function1<Any, Any?>,
        tonCallback: Function1<Any, Any?>,
        solanaCallback: Function1<Any, Any?>
    ) {}
    @JvmStatic fun onPageStarted(view: WebView, value: Boolean) {}
}
