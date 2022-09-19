package com.example.stayin.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.stayin.R
import com.example.stayin.databinding.FragmentForgotPasswordBinding
import com.example.stayin.databinding.FragmentSignInBinding

class ForgotPasswordFragment : Fragment(R.layout.fragment_forgot_password) {
    private lateinit var binding: FragmentForgotPasswordBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentForgotPasswordBinding.bind(view)
        clicks()
    }

    private fun clicks() {
        binding.txtRegisterNow.setOnClickListener { findNavController().navigate(R.id.action_forgotPasswordFragment_to_signUpFragment) }
        binding.imgNext.setOnClickListener { findNavController().navigate(R.id.action_forgotPasswordFragment_to_verificationFragment) }
    }

}