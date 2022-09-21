package com.example.stayin.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.stayin.R
import com.example.stayin.databinding.FragmentCardDetailBinding
import com.example.stayin.databinding.FragmentPaymentBinding


class CardDetailFragment : Fragment(R.layout.fragment_card_detail) {
    private lateinit var binding: FragmentCardDetailBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCardDetailBinding.bind(view)

        clicks()

    }

    private fun clicks() {
        binding.btnSave.setOnClickListener { findNavController().navigate(R.id.action_cardDetailFragment_to_bookingDetailsFragment) }
    }

}