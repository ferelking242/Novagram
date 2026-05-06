package com.appvillis.nicegram_wallet.module_bridge

import android.graphics.Bitmap

interface QrCodeRenderer {
    fun getQrBitmapByString(s: String, width: Int, height: Int): Bitmap?
}
