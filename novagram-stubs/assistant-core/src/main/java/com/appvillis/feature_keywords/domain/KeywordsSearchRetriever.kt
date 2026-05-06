package com.appvillis.feature_keywords.domain

import com.appvillis.feature_keywords.domain.entities.KeywordsMessage

interface KeywordsSearchRetriever {
    suspend fun searchMessages(query: String, folderId: Int): List<KeywordsMessage>
}
