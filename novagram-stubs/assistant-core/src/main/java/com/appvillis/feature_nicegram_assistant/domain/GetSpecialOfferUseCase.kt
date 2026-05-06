package com.appvillis.feature_nicegram_assistant.domain

class GetSpecialOfferUseCase {
    val specialOffer: SpecialOffersRepository.SpecialOffer? = null
    val allOffers: List<SpecialOffersRepository.SpecialOffer> = emptyList()

    fun haveSeenCurrentOffer(): Boolean = true
    fun canShowSpecialOfferCurrentSession(sessionNumber: Int): Boolean = false

    suspend operator fun invoke(): SpecialOffersRepository.SpecialOffer? = null
}
