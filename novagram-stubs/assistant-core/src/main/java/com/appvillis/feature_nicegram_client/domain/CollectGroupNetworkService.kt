package com.appvillis.feature_nicegram_client.domain

import com.appvillis.core_network.data.body.ChannelInfoRequest

class CollectGroupNetworkService {
    suspend fun collectGroup(request: ChannelInfoRequest): Any? = null
    suspend fun uploadMedia(data: ByteArray, mimeType: String): String? = null
}
