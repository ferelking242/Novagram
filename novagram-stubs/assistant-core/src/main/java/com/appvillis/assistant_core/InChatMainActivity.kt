package com.appvillis.assistant_core

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.appvillis.nicegram_wallet.wallet_contacts.domain.WalletContact

open class InChatMainActivity : AppCompatActivity() {
    companion object {
        @JvmStatic fun launch(context: Context, contact: WalletContact) {}
        @JvmStatic fun launch(context: Context, type: String) {}
        @JvmStatic fun launch(context: Context, contact: WalletContact, destination: Any) {}
    }
}
