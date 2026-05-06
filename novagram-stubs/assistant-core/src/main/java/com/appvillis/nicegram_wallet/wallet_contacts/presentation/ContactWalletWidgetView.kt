package com.appvillis.nicegram_wallet.wallet_contacts.presentation

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.appvillis.nicegram_wallet.wallet_contacts.domain.WalletContact

open class ContactWalletWidgetView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {
    fun setUserId(userId: Long) {}
    fun updateTheme() {}
    fun setData(contact: WalletContact, textColor: Int, accentColor: Int, events: Events) {}

    interface Events {
        fun onCopyClick(text: String)
        fun onSendClick()
    }
}
