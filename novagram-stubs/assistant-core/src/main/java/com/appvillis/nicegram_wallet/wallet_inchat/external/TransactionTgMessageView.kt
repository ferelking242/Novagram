package com.appvillis.nicegram_wallet.wallet_inchat.external

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

open class TransactionTgMessageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {
    companion object {
        @JvmStatic fun isThisTxMessage(text: String): Boolean = false
    }

    fun setData(text: String, incoming: Boolean) {}
    fun setTransactionId(id: String) {}
    fun setAmount(amount: String) {}
    fun updateTheme() {}
}
