package com.appvillis.feature_attention_economy.domain.usecases

import com.appvillis.feature_attention_economy.domain.entities.AttOngoingAction
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class GetOngoingActionsUseCase {
    operator fun invoke(): StateFlow<List<AttOngoingAction>> = MutableStateFlow(emptyList())
}
