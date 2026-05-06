package com.appvillis.nicegram_wallet.wallet_settings.domain

class UserBlockchainsRepository {
    fun getEnabledBlockchains(): List<String> = emptyList()
    fun isBlockchainEnabled(id: String): Boolean = false
}
