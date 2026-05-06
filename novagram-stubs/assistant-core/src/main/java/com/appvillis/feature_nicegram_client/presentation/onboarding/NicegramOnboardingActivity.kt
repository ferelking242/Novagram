package com.appvillis.feature_nicegram_client.presentation.onboarding

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

open class NicegramOnboardingActivity : AppCompatActivity() {
    companion object {
        @JvmStatic fun createIntent(context: Context): Intent = Intent(context, NicegramOnboardingActivity::class.java)
        @JvmStatic fun launch(context: Context) {
            context.startActivity(createIntent(context))
        }
    }
}
