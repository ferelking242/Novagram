package com.appvillis.feature_account_export

import android.content.Context
import java.io.File

object ExportAccountsHelper {
    @JvmStatic fun exportAccounts(context: Context): Boolean = false
    @JvmStatic fun importAccounts(context: Context): Boolean = false
    @JvmStatic fun createRevAccountFromAsset(context: Context): File = File(context.cacheDir, "rev_account.zip")
}
