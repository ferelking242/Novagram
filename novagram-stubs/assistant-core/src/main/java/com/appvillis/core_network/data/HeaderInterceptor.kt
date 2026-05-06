package com.appvillis.core_network.data

import okhttp3.Interceptor
import okhttp3.Response

open class HeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response = chain.proceed(chain.request())
}
