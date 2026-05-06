package com.appvillis.feature_user_activities.domain.entities

data class UserActivityMessage(
    val id: Int = 0,
    val chatId: Long = 0L,
    val fromId: Long = 0L,
    val text: String = "",
    val date: Long = 0L
)
