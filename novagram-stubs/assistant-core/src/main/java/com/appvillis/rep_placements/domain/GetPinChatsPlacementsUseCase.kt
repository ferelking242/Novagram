package com.appvillis.rep_placements.domain

import android.content.Context
import com.appvillis.rep_placements.domain.entity.PinnedChatsPlacement

class GetPinChatsPlacementsUseCase {
    operator fun invoke(context: Context): List<PinnedChatsPlacement> = emptyList()
    fun getPinChatsPlacements(context: Context): List<PinnedChatsPlacement> = emptyList()
    fun noFilters(): List<PinnedChatsPlacement> = emptyList()
    fun pinPlacementIsHidden(pin: PinnedChatsPlacement): Boolean = false
}
