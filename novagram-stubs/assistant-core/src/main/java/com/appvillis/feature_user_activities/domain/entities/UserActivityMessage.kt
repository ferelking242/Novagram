package com.appvillis.feature_user_activities.domain.entities

data class UserActivityMessage(
    val messageId: Long = 0L,
    val chatId: Long = 0L,
    val chatTitle: String = "",
    val date: Long = 0L,
    val text: String = ""
)
