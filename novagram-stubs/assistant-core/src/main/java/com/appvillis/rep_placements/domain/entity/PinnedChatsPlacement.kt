package com.appvillis.rep_placements.domain.entity

data class PinnedChatsPlacement(
    val id: String = "",
    val name: String = "",
    val chatIds: List<Long> = emptyList(),
    val order: Int = 0
)
