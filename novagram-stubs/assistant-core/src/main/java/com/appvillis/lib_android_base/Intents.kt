package com.appvillis.lib_android_base

import android.content.Context
import android.content.Intent
import android.net.Uri

object Intents {
    @JvmStatic fun openUrl(context: Context, url: String) {
        try {
            context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        } catch (e: Exception) {}
    }

    @JvmStatic fun share(context: Context, text: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, text)
        }
        try {
            context.startActivity(Intent.createChooser(intent, null))
        } catch (e: Exception) {}
    }
}
