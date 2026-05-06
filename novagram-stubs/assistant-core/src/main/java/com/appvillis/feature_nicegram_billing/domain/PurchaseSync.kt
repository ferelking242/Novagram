package com.appvillis.feature_nicegram_billing.domain

interface PurchaseSync {
    suspend fun syncPurchase(purchaseToken: String, productId: String)
}
