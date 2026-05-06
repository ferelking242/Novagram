package com.appvillis.feature_auth.domain

interface TelegramBotBridge {
    fun sendStartMessage(botUsername: String, msg: String)
}
