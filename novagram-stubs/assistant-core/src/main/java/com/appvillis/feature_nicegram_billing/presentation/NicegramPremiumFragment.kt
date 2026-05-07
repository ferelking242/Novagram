package com.appvillis.feature_nicegram_billing.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class NicegramPremiumFragment : Fragment() {
    companion object {
        @JvmStatic fun newInstance(showContinueBtn: Boolean = false): NicegramPremiumFragment = NicegramPremiumFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = null
}
