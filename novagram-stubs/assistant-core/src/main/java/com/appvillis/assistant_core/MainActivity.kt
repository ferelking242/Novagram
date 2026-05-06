package com.appvillis.assistant_core

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appvillis.feature_ai_chat.domain.entity.AiCommand
import com.appvillis.nicegram_wallet.wallet_dapps.domain.DApp

open class MainActivity : AppCompatActivity() {
    companion object {
        @JvmStatic fun launchAiBot(context: Context) {}
        @JvmStatic fun launchAiGreetings(context: Context) {}
        @JvmStatic fun launchAiTopUp(context: Context, flag: Boolean) {}
        @JvmStatic fun launchAiBotDialog(command: AiCommand?, text: String?, activity: Activity) {}
        @JvmStatic fun launchRoute(context: Context, actionId: Int, args: Bundle?) {}
        @JvmStatic fun launchWalletStart(context: Context) {}
        @JvmStatic fun launchAssistant(context: Context) {}
        @JvmStatic fun launchPassCode(context: Context) {}
        @JvmStatic fun launchDApp(dApp: DApp, context: Context) {}
        @JvmStatic fun launchWalletIfPossible(context: Context) {}
    }
}
