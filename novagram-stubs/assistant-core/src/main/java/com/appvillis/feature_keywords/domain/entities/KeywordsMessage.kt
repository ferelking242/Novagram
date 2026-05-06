package com.appvillis.feature_keywords.domain.entities

data class KeywordsMessage(
    val id: Int = 0,
    val chatId: Long = 0,
    val text: String = "",
    val keywords: List<String> = emptyList()
)
