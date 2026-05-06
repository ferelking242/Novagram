package com.appvillis.core_network

import com.appvillis.core_network.data.body.HuaweiSubscriptionRequestBody
import com.appvillis.core_network.data.body.HuaweiTopUpRequestBody

interface ApiService {
    suspend fun buyNicegramSubscriptionHuawei(body: HuaweiSubscriptionRequestBody): ApiResponse<BalanceData>
    suspend fun buyNicegramTopUpHuawei(body: HuaweiTopUpRequestBody): ApiResponse<BalanceData>
}

data class ApiResponse<T>(
    val status: Int = 0,
    val data: T? = null,
    val message: String? = null
)

data class BalanceData(
    val balance: Long = 0L
)
