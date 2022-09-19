package com.example.stayin.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.stayin.R
import com.example.stayin.databinding.FragmentSignInBinding
import com.example.stayin.databinding.FragmentVerificationBinding

class VerificationFragment : Fragment(R.layout.fragment_verification) {
    private lateinit var binding: FragmentVerificationBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentVerificationBinding.bind(view)
        clicks()
    }

    private fun clicks() {
        binding.imgNext.setOnClickListener { findNavController().navigate(R.id.action_verificationFragment_to_signInFragment) }
    }

}