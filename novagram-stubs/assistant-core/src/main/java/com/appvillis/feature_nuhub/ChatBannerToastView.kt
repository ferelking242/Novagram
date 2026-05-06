package com.appvillis.feature_nuhub

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

open class ChatBannerToastView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {
    fun show() {}
    fun hide() {}

    data class ChatBannerData(
        val id: String = "",
        val title: String = "",
        val desc: String = "",
        val image: String? = null,
        val bgImage: String? = null,
        val urlAndroid: String = ""
    )

    companion object {
        @JvmStatic
        fun newInstance(context: Context, bannerData: ChatBannerData, action: () -> Any?): ChatBannerToastView {
            return ChatBannerToastView(context)
        }
    }
}
