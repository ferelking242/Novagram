package com.appvillis.nicegram_wallet.wallet_dapps.domain

data class DApp(
    val id: String = "",
    val name: String = "",
    val url: String = "",
    val iconUrl: String? = null,
    val description: String? = null
)
