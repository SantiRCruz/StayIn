package com.example.stayin.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.example.stayin.R
import com.example.stayin.databinding.DialogSuccessfulBinding
import com.example.stayin.databinding.FragmentBookingDetailsBinding
import com.example.stayin.databinding.FragmentCardDetailBinding


class BookingDetailsFragment : Fragment(R.layout.fragment_booking_details) {
    private lateinit var binding: FragmentBookingDetailsBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBookingDetailsBinding.bind(view)

        clicks()

    }

    private fun clicks() {
        binding.btnPay.setOnClickListener { createDialog() }
    }

    private fun createDialog() {
        val dialog = DialogSuccessfulBinding.inflate(LayoutInflater.from(requireContext()))
        val alertDialog = AlertDialog.Builder(requireContext()).apply {
            setView(dialog.root)
        }.create()
        dialog.btnDownload.setOnClickListener {
            alertDialog.dismiss()
            findNavController().popBackStack(R.id.locationFragment,false)
        }
        alertDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        alertDialog.setCancelable(false)
        alertDialog.show()
    }

}
