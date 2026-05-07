package com.appvillis.feature_nicegram_client

import android.content.Context

object TgThemeHelper {
    interface ResourceProvider {
        val theme: Theme
        interface Theme {
            fun isNightTheme(): Boolean
        }
    }

    @JvmStatic var TG_RESOURCE_PROVIDER: ResourceProvider? = null

    @JvmStatic fun applyTheme(context: Context) {}
    @JvmStatic fun isDarkTheme(context: Context): Boolean = false
    @JvmStatic fun getAccentColor(context: Context): Int = 0
}
