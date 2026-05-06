package com.appvillis.nicegram_wallet.module_bridge

class InChatResultManager {
    var listener: InChatResultLister? = null

    fun interface InChatResultLister {
        fun onResult(result: Any?)
    }
}
