package com.appvillis.feature_gods_eye

import com.appvillis.feature_gods_eye.domain.usecases.GetGodsEyeConfigUseCase
import com.appvillis.feature_gods_eye.presentation.GodsEyeHelper
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface GodsEyeEntryPoint {
    fun getGodsEyeConfigUseCase(): GetGodsEyeConfigUseCase
    fun godsEyeHelper(): GodsEyeHelper
}
