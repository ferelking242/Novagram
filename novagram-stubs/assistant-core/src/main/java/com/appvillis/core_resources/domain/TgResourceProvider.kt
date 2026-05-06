package com.appvillis.core_resources.domain

interface TgResourceProvider {
    fun getTheme(): ThemeProxy
    fun setThemeProxy(proxy: ThemeProxy)

    interface ThemeProxy {
        fun getColor(key: String): Int
        fun getDrawable(key: String): android.graphics.drawable.Drawable?
    }
}
