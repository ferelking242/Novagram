package com.appvillis.rep_placements.domain.entity

data class ChatPlacement(
    val id: String = "",
    val chatId: Long = 0L,
    val name: String = "",
    val order: Int = 0,
    val title: String = "",
    val desc: String = "",
    val image: String? = null,
    val bgImage: String? = null,
    val urlAndroid: String = "",
    val showInRestrictedChat: Boolean = false,
    val showInChat: Boolean = true,
    val showToPremium: Boolean = false,
    val showAgainAfterSeconds: Long = 0L
)
