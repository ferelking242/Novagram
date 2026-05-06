package com.appvillis.feature_nicegram_client.presentation.premium

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

open class NicegramPremiumActivity : AppCompatActivity() {
    companion object {
        @JvmStatic fun createIntent(context: Context): Intent = Intent(context, NicegramPremiumActivity::class.java)
        @JvmStatic fun launch(context: Context) {
            context.startActivity(createIntent(context))
        }
    }
}
