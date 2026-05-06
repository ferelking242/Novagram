package com.appvillis.feature_account_export.domain

interface ExportEventsBridge {
    fun onAccountExported(account: Account)
    fun onAccountImported(account: Account)
}
