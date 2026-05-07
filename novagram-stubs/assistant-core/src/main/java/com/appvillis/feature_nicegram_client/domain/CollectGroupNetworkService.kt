package com.appvillis.feature_nicegram_client.domain

import com.appvillis.core_network.data.body.ChannelInfoRequest
import com.appvillis.core_network.data.body.UploadInitiateMultipleBody
import com.appvillis.feature_nicegram_client.domain.etities.UploadInformation

class CollectGroupNetworkService {
    suspend fun collectGroup(request: ChannelInfoRequest): Any? = null
    suspend fun uploadMedia(data: ByteArray, mimeType: String): String? = null
    suspend fun uploadInitiateMultiple(body: UploadInitiateMultipleBody): List<UploadInformation> = emptyList()
}
