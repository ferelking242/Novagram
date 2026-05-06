package com.appvillis.feature_keywords.domain

class KeywordsPreferencesRepository {
    fun getKeywordsForFolder(folderId: Int): List<String> = emptyList()
    fun setKeywordsForFolder(folderId: Int, keywords: List<String>) {}
    fun isTrackingEnabled(folderId: Int): Boolean = false
    fun setTrackingEnabled(folderId: Int, enabled: Boolean) {}
    fun getHasSeenHint(): Boolean = true
    fun setHasSeenHint(value: Boolean) {}
}
