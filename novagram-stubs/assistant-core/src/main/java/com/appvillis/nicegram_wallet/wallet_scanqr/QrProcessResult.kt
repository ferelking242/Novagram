package com.appvillis.nicegram_wallet.wallet_scanqr

sealed class QrProcessResult {
    data class Success(val data: String) : QrProcessResult()
    data class Error(val message: String) : QrProcessResult()
    object NotRecognized : QrProcessResult()
}
