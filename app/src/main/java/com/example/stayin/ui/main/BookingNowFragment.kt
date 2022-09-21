package com.example.stayin.ui.main

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.stayin.R
import com.example.stayin.databinding.FragmentBookingNowBinding
import com.example.stayin.databinding.ItemToVisitBinding


class BookingNowFragment : Fragment(R.layout.fragment_booking_now) {
    private lateinit var binding: FragmentBookingNowBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBookingNowBinding.bind(view)

        clicks()
    }

    private fun clicks() {
        binding.btnConfirm.setOnClickListener { findNavController().navigate(R.id.action_bookingNowFragment_to_paymentFragment) }
    }

}

