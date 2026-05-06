package com.appvillis.rep_user.domain

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class UserRepository {
    val userData: StateFlow<UserData?> = MutableStateFlow(null)
    val isUserLoggedIn: Boolean = false

    data class UserData(
        val id: Long = 0L,
        val phone: String = "",
        val hasAnySub: Boolean = false,
        val isPremium: Boolean = false
    )
}
