package com.appvillis.rep_user_actions.domain.entities

data class AttUserAction(
    val id: String = "",
    val chatId: Long = 0L,
    val type: String = "",
    val timestamp: Long = 0L
)
