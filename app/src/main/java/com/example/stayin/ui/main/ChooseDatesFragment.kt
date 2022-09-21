package com.example.stayin.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.stayin.R
import com.example.stayin.databinding.FragmentChooseDatesBinding
import com.example.stayin.databinding.SheetDetailPlaceBinding

class ChooseDatesFragment : Fragment(R.layout.fragment_choose_dates) {
    private lateinit var binding: FragmentChooseDatesBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentChooseDatesBinding.bind(view)

        binding.btnDone.setOnClickListener { findNavController().navigate(R.id.action_chooseDatesFragment_to_detailPlaceFragment) }
    }

}