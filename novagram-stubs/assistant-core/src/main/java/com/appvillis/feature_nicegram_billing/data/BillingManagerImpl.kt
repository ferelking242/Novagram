package com.appvillis.feature_nicegram_billing.data

import android.app.Activity
import android.content.Intent
import com.appvillis.feature_nicegram_billing.domain.BillingManager
import com.appvillis.feature_nicegram_billing.domain.InApp
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class BillingManagerImpl @Inject constructor() : BillingManager {
    override val eventBillingIsReady: StateFlow<Boolean> = MutableStateFlow(false)
    override val userActiveSub: StateFlow<BillingManager.SubLevel> = MutableStateFlow(BillingManager.SubLevel.None)
    override val hasAnyPremium: Boolean = false
    override val billingStateFlow: Flow<BillingManager.BillingState> = MutableSharedFlow()
    override val currentSubPurchaseToken: String? = null

    override fun initializeBilling() {}
    override fun restore() {}
    override suspend fun queryStoreProductInfo(productIds: List<String>, isSubs: Boolean): List<InApp.StoreInfo> = emptyList()
    override fun launchPayment(activity: Activity, storeInfo: InApp.StoreInfo) {}
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {}
    override suspend fun sendSubToServer(id: String) {}
    override fun onPaymentScreenResume() {}
}
