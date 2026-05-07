package com.appvillis.lib_android_base

import android.app.Activity
import android.app.Dialog
import android.content.res.Configuration
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.view.WindowInsetsController
import androidx.viewbinding.ViewBinding

fun Activity.setLightStatusBar() {
    try {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.setSystemBarsAppearance(
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
            )
        } else {
            @Suppress("DEPRECATION")
            window.decorView.systemUiVisibility = window.decorView.systemUiVisibility or
                    View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
    } catch (e: Exception) {}
}

fun Activity.clearLightStatusBar() {
    try {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.setSystemBarsAppearance(
                0,
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
            )
        } else {
            @Suppress("DEPRECATION")
            window.decorView.systemUiVisibility = window.decorView.systemUiVisibility and
                    View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv()
        }
    } catch (e: Exception) {}
}

fun Activity.setTransparentStatusBar() {
    try {
        window.statusBarColor = android.graphics.Color.TRANSPARENT
    } catch (e: Exception) {}
}

fun Activity.isNightMode(): Boolean {
    return (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
}

inline fun <T : android.view.View> android.app.Activity.viewBinding(
    crossinline bind: (View) -> T
): Lazy<T> = lazy(LazyThreadSafetyMode.NONE) { bind(window.decorView) }

inline fun <T : android.view.View> androidx.fragment.app.Fragment.viewBinding(
    crossinline bind: (View) -> T
): Lazy<T> = lazy(LazyThreadSafetyMode.NONE) { bind(requireView()) }

inline fun <reified T : ViewBinding> Dialog.viewBinding(): Lazy<T> =
    lazy(LazyThreadSafetyMode.NONE) {
        val inflate = T::class.java.getMethod("inflate", LayoutInflater::class.java)
        @Suppress("UNCHECKED_CAST")
        val binding = inflate.invoke(null, LayoutInflater.from(context)) as T
        setContentView(binding.root)
        binding
    }
