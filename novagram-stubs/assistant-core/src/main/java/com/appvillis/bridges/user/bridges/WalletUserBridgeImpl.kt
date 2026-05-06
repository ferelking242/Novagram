package com.appvillis.bridges.user.bridges

class WalletUserBridgeImpl : TgAuthBridge {
    override val isLoggedInInTg: Boolean = false
    override val telegramId: Long = 0L

    companion object {
        @JvmField var isDemoUser: Boolean = false
    }
}
