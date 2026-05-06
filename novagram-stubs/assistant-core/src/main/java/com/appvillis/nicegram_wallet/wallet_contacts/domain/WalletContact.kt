package com.appvillis.nicegram_wallet.wallet_contacts.domain

data class WalletContact(
    val id: String = "",
    val firstName: String? = null,
    val lastName: String? = null,
    val username: String? = null,
    val avatarSymbols: String = "",
    val img: String = ""
) {
    companion object {
        @JvmField var closeInChatAfterWallet: Boolean = false
        @JvmField var navigateToMainWalletAfterClose: Boolean = false

        @JvmField val PREVIEW = WalletContact()

        @JvmStatic fun create(
            id: String,
            firstName: String? = null,
            lastName: String? = null,
            username: String? = null,
            avatarSymbols: String = "",
            img: String = ""
        ): WalletContact = WalletContact(id, firstName, lastName, username, avatarSymbols, img)
    }

    fun getDisplayName(): String = buildString {
        if (!firstName.isNullOrEmpty()) append(firstName)
        if (!lastName.isNullOrEmpty()) {
            if (isNotEmpty()) append(" ")
            append(lastName)
        }
        if (isEmpty() && !username.isNullOrEmpty()) append("@$username")
        if (isEmpty()) append(id)
    }
}
