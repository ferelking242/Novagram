package com.appvillis.feature_ai_chat.domain.entity

data class EsimSplashData(
    val title: String = "",
    val description: String = "",
    val imageUrl: String? = null,
    val coupon: String? = null,
    val url: String = ""
) {
    fun getCoupon(): String? = coupon
    fun getUrl(): String = url
}
