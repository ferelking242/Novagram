package com.appvillis.feature_attention_economy.domain.entities

data class AttOngoingAction(
    val type: AttOngoingActionType = AttOngoingActionType.Subscribe(""),
    val ad: AttAdAction = AttAdAction()
)
