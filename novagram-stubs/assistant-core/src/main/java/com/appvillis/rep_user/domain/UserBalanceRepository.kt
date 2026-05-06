package com.appvillis.rep_user.domain

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class UserBalanceRepository {
    val balance: Flow<Double> = MutableStateFlow(0.0)
    val gemBalance: Long = 0L
    suspend fun refreshBalance() {}
}
