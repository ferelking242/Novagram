package com.appvillis.feature_attention_economy.domain.entities

data class AttAdAction(
    val id: String = "",
    val type: AttAdActionType = AttAdActionType.Subscribe,
    val targetId: String = ""
) {
    enum class AttAdActionType {
        Subscribe,
        Visit,
        Follow
    }
}
