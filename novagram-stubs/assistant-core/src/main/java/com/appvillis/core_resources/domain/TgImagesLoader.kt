package com.appvillis.core_resources.domain

import android.graphics.Bitmap

interface TgImagesLoader {
    fun getImgForDialog(dialogId: Long): String
    fun loadAvatar(userId: Long, callback: (Bitmap?) -> Unit) {}
}
