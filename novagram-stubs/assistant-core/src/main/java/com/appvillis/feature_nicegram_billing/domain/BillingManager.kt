package com.appvillis.feature_nicegram_billing.domain

import android.app.Activity
import android.content.Intent
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

interface BillingManager {
    val eventBillingIsReady: StateFlow<Boolean>
    val userActiveSub: StateFlow<SubLevel>
    val hasAnyPremium: Boolean
    val billingStateFlow: Flow<BillingState>
    val currentSubPurchaseToken: String?

    fun initializeBilling()
    fun restore()
    suspend fun queryStoreProductInfo(productIds: List<String>, isSubs: Boolean): List<InApp.StoreInfo>
    fun launchPayment(activity: Activity, storeInfo: InApp.StoreInfo)
    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
    suspend fun sendSubToServer(id: String)
    fun onPaymentScreenResume()

    sealed class SubLevel {
        object None : SubLevel()
        object Premium : SubLevel()
        object PremiumPlus : SubLevel()
    }

    sealed class BillingState {
        object Idle : BillingState()
        object Loading : BillingState()
        data class Success(val balance: Long, val isSub: Boolean) : BillingState()
        data class Error(val message: String) : BillingState()
    }

    interface BillingResultActivity {
        fun addResultListener(listener: BillingResultListener)

        interface BillingResultListener {
            fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
        }
    }
}
