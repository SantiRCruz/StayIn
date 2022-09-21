package com.example.stayin.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.stayin.R
import com.example.stayin.databinding.FragmentBookingNowBinding
import com.example.stayin.databinding.FragmentPaymentBinding


class PaymentFragment : Fragment(R.layout.fragment_payment) {
    private lateinit var binding: FragmentPaymentBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPaymentBinding.bind(view)

        clicks()

    }

    private fun clicks() {
        binding.llCreditCard.setOnClickListener { findNavController().navigate(R.id.action_paymentFragment_to_cardDetailFragment) }
    }

}
