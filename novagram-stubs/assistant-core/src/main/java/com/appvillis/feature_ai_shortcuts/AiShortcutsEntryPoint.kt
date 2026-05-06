package com.appvillis.feature_ai_shortcuts

import com.appvillis.feature_ai_shortcuts.domain.usecases.GetAiShortcutsSettingsUseCase
import com.appvillis.feature_ai_shortcuts.domain.usecases.UpdateAiShortcutsSettingsUseCase
import com.appvillis.feature_ai_shortcuts.presentation.AiShortcutsHelper
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface AiShortcutsEntryPoint {
    fun aiShortcutsHelper(): AiShortcutsHelper
    fun aiShortcutsUiHelper(): AiShortcutsHelper
    fun getSettingsUseCase(): GetAiShortcutsSettingsUseCase
    fun updateSettingsUseCase(): UpdateAiShortcutsSettingsUseCase
}
