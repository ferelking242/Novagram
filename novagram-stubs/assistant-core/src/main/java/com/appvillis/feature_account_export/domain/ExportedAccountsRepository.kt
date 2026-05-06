package com.appvillis.feature_account_export.domain

class ExportedAccountsRepository {
    fun getExportedAccounts(): List<Account> = emptyList()
    fun saveAccount(account: Account) {}
    fun removeAccount(id: Long) {}
}
