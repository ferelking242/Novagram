package com.appvillis.feature_gods_eye.domain.usecases

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class GetGodsEyeConfigUseCase {
    suspend operator fun invoke(): Any? = null
    fun isEnabled(): Boolean = false
    fun getEnabled(): StateFlow<Boolean> = MutableStateFlow(false)
}
