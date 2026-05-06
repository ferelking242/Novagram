package com.appvillis.nicegram_wallet.wallet_contacts.domain

interface ContactsRetriever {
    suspend fun getContacts(): List<WalletContact>
}
