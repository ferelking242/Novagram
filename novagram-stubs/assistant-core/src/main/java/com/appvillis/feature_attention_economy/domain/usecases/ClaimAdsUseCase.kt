package com.appvillis.feature_attention_economy.domain.usecases

import com.appvillis.feature_attention_economy.domain.entities.AttAdAction
import com.appvillis.feature_attention_economy.domain.entities.AttOngoingActionType

class ClaimAdsUseCase {
    suspend operator fun invoke(type: AttOngoingActionType, ad: AttAdAction, chatId: Long) {}
}
