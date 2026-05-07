package com.appvillis.feature_chat_widgets

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope

@EntryPoint
@InstallIn(SingletonComponent::class)
interface NgWidgetsEntryPoint {
    fun ngWidgetsHelper(): NgWidgetsHelper
    fun appScope(): CoroutineScope
    fun pinnedBannerManager(): PinnedBannerManager
}
