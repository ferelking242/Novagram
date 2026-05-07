package com.appvillis.feature_attention_economy.domain.usecases

import com.appvillis.feature_attention_economy.domain.entities.AttAdAction

class ClaimAdsUseCase {
    suspend operator fun invoke(type: AttAdAction.AttAdActionType, ad: AttAdAction, chatId: Long) {}
}
