package com.appvillis.nicegram_wallet.wallet_scanqr

class QrResultEmitter {
    fun emit(result: QrProcessResult) {}
    var pendingResult: QrProcessResult? = null
}
