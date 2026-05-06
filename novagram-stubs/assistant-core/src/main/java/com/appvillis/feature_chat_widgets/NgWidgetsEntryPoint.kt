package com.appvillis.feature_chat_widgets

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface NgWidgetsEntryPoint {
    fun ngWidgetsHelper(): NgWidgetsHelper
}
