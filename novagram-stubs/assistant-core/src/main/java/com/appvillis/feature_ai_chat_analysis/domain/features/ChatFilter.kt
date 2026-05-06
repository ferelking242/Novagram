package com.appvillis.feature_ai_chat_analysis.domain.features

data class ChatFilter(
    val chatIds: Set<Long> = emptySet(),
    val fromDate: Long? = null,
    val toDate: Long? = null,
    val keywords: List<String> = emptyList()
) {
    constructor(chatIds: Set<Long>) : this(chatIds = chatIds, fromDate = null, toDate = null, keywords = emptyList())
}
