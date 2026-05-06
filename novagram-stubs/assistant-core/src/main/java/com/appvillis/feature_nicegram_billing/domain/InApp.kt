package com.appvillis.feature_nicegram_billing.domain

data class InApp(
    val productId: String = "",
    val title: String = "",
    val price: String = "",
    val priceAmount: Double = 0.0,
    val currencyCode: String = ""
) {
    interface StoreInfo {
        val priceWithCurrency: String
        val id: String
    }
}
