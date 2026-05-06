package com.appvillis.feature_keywords

import com.appvillis.feature_keywords.domain.KeywordsMessagesProcessor
import com.appvillis.feature_keywords.domain.KeywordsPreferencesRepository
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface KeywordsEntryPoint {
    fun keywordsMessagesProcessor(): KeywordsMessagesProcessor
    fun keywordsPreferencesRepository(): KeywordsPreferencesRepository
    fun keywordsPreferences(): KeywordsPreferencesRepository
}
