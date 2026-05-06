package com.appvillis.feature_keywords.domain

import com.appvillis.feature_keywords.domain.entities.KeywordsMessage

class KeywordsMessagesProcessor {
    fun processMessage(chatId: Long, messageId: Int, text: String): KeywordsMessage? = null
    fun isKeywordMatched(text: String, folderId: Int): Boolean = false
    fun addMessageToFolderIfNeeded(messageId: String, text: String, name: String, dialogId: Long, date: Long) {}
}
