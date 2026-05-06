package com.appvillis.nicegram_wallet.module_bridge

import com.appvillis.nicegram_wallet.wallet_contacts.domain.ContactsRetriever
import com.appvillis.nicegram_wallet.wallet_settings.domain.UserBlockchainsRepository
import com.appvillis.nicegram_wallet.wallet_storage.domain.GetCurrentWalletUseCase
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface NgWalletEntryPoint {
    fun contactsRetriever(): ContactsRetriever
    fun userBlockchainsRepository(): UserBlockchainsRepository
    fun getUserBlockchainsRepository(): UserBlockchainsRepository
    fun getCurrentWalletUseCase(): GetCurrentWalletUseCase
    fun inChatResultManager(): InChatResultManager
}
