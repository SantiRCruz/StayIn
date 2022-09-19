package com.example.stayin.ui.onboarding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.stayin.R
import com.example.stayin.databinding.ActivityMainBinding
import com.example.stayin.databinding.FragmentOnboarding1Binding


class OnBoarding1Fragment : Fragment(R.layout.fragment_onboarding1) {
    private lateinit var binding: FragmentOnboarding1Binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOnboarding1Binding.bind(view)

        clicks()
    }

    private fun clicks() {
        binding.txtNext.setOnClickListener { findNavController().navigate(R.id.action_onBoarding1Fragment_to_onBoarding2Fragment) }
    }

}