package com.appvillis.feature_nicegram_assistant.domain

interface SpecialOffersRepository {
    suspend fun hasActiveOffer(): Boolean
    suspend fun getActiveOffer(): SpecialOffer?

    data class SpecialOffer(
        val id: Int = 0,
        val url: String = "",
        val title: String = "",
        val description: String = "",
        val imageUrl: String? = null
    )
}
