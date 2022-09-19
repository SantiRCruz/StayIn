package com.example.stayin.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.stayin.R
import com.example.stayin.databinding.FragmentOnBoarding2Binding
import com.example.stayin.databinding.FragmentOnboarding1Binding


class OnBoarding2Fragment : Fragment(R.layout.fragment_on_boarding2) {
    private lateinit var binding: FragmentOnBoarding2Binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOnBoarding2Binding.bind(view)

        clicks()
    }

    private fun clicks() {
        binding.txtNext.setOnClickListener { findNavController().navigate(R.id.action_onBoarding2Fragment_to_onBoarding3Fragment) }
    }
}