package com.appvillis.feature_account_export.domain

data class Account(
    val id: Long = 0L,
    val phone: String = "",
    val name: String = "",
    val username: String? = null
)
