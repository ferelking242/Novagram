package com.appvillis.nicegram_wallet.module_bridge

interface ContactMessageSender {
    fun sendMessage(text: String, id: String)
}
