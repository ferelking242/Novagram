package com.appvillis.core_resources

import com.appvillis.core_resources.domain.TgImagesLoader
import com.appvillis.core_resources.domain.TgResourceProvider
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface CoreUiEntryPoint {
    fun tgResourceProvider(): TgResourceProvider
    fun tgImagesLoader(): TgImagesLoader
}
