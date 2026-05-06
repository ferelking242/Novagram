package com.appvillis.feature_attention_economy.domain.entities

sealed class AttOngoingActionType {
    abstract fun getId(): String

    data class Subscribe(private val id: String) : AttOngoingActionType() {
        override fun getId(): String = id
    }

    data class Visit(private val id: String) : AttOngoingActionType() {
        override fun getId(): String = id
    }
}
