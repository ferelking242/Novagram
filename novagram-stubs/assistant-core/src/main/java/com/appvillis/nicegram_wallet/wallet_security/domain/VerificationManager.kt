package com.appvillis.nicegram_wallet.wallet_security.domain

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class VerificationManager {
    fun isVerified(): Boolean = false
    fun verify(callback: (Boolean) -> Unit) { callback(false) }
    fun doActionAfterVerification(scope: CoroutineScope, action: suspend () -> Unit) {
        scope.launch { action() }
    }
}
