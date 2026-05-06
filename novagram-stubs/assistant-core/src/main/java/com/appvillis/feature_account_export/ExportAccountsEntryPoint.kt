package com.appvillis.feature_account_export

import com.appvillis.feature_account_export.domain.ExportEventsBridge
import com.appvillis.feature_account_export.domain.ExportedAccountsRepository
import com.appvillis.feature_account_export.domain.usecases.SaveExportedAccountsUseCase
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope

@EntryPoint
@InstallIn(SingletonComponent::class)
interface ExportAccountsEntryPoint {
    fun exportedAccountsRepository(): ExportedAccountsRepository
    fun appScope(): CoroutineScope
    fun exportEventsBridge(): ExportEventsBridge
    fun saveExportedAccountsUseCase(): SaveExportedAccountsUseCase
}
