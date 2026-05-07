package com.appvillis.lib_android_base.domain

sealed class OperationResult<out T> {
    data class Success<out T>(val data: T) : OperationResult<T>()
    data class ResultSuccess<out T>(val result: T) : OperationResult<T>()
    data class Error(val message: String, val throwable: Throwable? = null) : OperationResult<Nothing>()
    object Loading : OperationResult<Nothing>()

    val isSuccess: Boolean get() = this is Success || this is ResultSuccess
    val isError: Boolean get() = this is Error

    fun getOrNull(): T? = when (this) {
        is Success -> data
        is ResultSuccess -> result
        else -> null
    }

    companion object {
        fun <T> mapThrowableToResult(e: Throwable): OperationResult<T> =
            Error(e.message ?: "Unknown error", e)
    }
}
