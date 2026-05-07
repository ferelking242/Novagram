package com.appvillis.feature_account_export.domain

interface ExportEventsBridge {
    fun sendEvent(event: String)
    fun onAccountExported(account: Account)
    fun onAccountImported(account: Account)

    companion object {
        const val EVENT_EXPORT_IMPORT_COMPLETED = "export_import_completed"
    }
}
