package com.appvillis.nicegram_wallet.wallet_dapps.domain.usecases

import com.appvillis.nicegram_wallet.wallet_dapps.domain.DApp
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class GetDAppsUseCase {
    data class DAppsResult(val data: List<DApp> = emptyList())

    operator fun invoke(): StateFlow<DAppsResult> = MutableStateFlow(DAppsResult())
    suspend fun getDApps(): List<DApp> = emptyList()
}
