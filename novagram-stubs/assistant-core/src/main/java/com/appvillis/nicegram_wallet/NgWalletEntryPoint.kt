package com.appvillis.nicegram_wallet

import com.appvillis.nicegram_wallet.wallet_dapps.domain.BrowserResponseManager
import com.appvillis.nicegram_wallet.wallet_dapps.domain.GetDAppsUseCase
import com.appvillis.nicegram_wallet.wallet_dapps.domain.TgBrowserBridgeFactory
import com.appvillis.nicegram_wallet.wallet_settings.domain.UserBlockchainsRepository
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface NgWalletEntryPoint {
    fun getUserBlockchainsRepository(): UserBlockchainsRepository
    fun getDAppsUseCase(): GetDAppsUseCase
    fun tgBrowserBridgeFactory(): TgBrowserBridgeFactory
    fun browserResponseManager(): BrowserResponseManager
}
