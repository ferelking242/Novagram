package com.appvillis.feature_ai_chat_analysis.domain.entities

data class SourceData(
    val chatId: Long = 0L,
    val chatFullname: String = "",
    val chatUsername: String = "",
    val messages: List<Message> = emptyList()
) {
    data class Message(
        val displayName: String = "",
        val date: Long = 0L,
        val text: String = ""
    )
}
