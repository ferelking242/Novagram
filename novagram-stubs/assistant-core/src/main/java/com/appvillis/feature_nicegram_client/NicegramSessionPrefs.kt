package com.appvillis.feature_nicegram_client

import android.content.Context

object NicegramSessionPrefs {
    @JvmStatic fun getSessionCount(context: Context): Int = 0
    @JvmStatic fun incrementSessionCount(context: Context) {}
    @JvmStatic fun getFirstLaunchTime(context: Context): Long = 0L
}
