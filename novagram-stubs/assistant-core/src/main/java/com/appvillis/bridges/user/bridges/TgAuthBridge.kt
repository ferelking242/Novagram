package com.appvillis.bridges.user.bridges

interface TgAuthBridge {
    val isLoggedInInTg: Boolean
    val telegramId: Long
}
