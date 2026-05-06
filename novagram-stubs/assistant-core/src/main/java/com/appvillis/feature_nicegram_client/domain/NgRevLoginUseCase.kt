package com.appvillis.feature_nicegram_client.domain

class NgRevLoginUseCase {
    suspend operator fun invoke() {}
    suspend fun login(telegramId: Long) {}
    fun isReviewPhone(phone: String): Boolean = false
    fun onLoginBntClicked(phone: String) {}
    fun getLoginUrl(): String = ""
    fun getLoginTsForPhone(phone: String): Long = 0L
}
