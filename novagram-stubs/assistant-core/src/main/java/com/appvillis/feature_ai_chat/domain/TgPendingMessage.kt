package com.appvillis.feature_ai_chat.domain

data class TgPendingMessage(
    val chatId: Long = 0L,
    val messageId: Int = 0,
    val text: String = ""
)
