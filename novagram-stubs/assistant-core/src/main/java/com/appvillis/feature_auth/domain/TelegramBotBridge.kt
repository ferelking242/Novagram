package com.appvillis.feature_auth.domain

interface TelegramBotBridge {
    suspend fun sendStartMessage(botUsername: String, msg: String)
}
