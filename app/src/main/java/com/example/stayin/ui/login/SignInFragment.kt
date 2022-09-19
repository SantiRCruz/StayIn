package com.example.stayin.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.stayin.HomeActivity
import com.example.stayin.R
import com.example.stayin.databinding.FragmentOnBoarding3Binding
import com.example.stayin.databinding.FragmentSignInBinding


class SignInFragment : Fragment(R.layout.fragment_sign_in) {
    private lateinit var binding: FragmentSignInBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignInBinding.bind(view)
        clicks()
    }

    private fun clicks() {
        binding.txtForgotPassword.setOnClickListener { findNavController().navigate(R.id.action_signInFragment_to_forgotPasswordFragment) }
        binding.txtSignUp.setOnClickListener { findNavController().navigate(R.id.action_signInFragment_to_signUpFragment) }
        binding.imgNext.setOnClickListener {
            startActivity(Intent(requireActivity(),HomeActivity::class.java))
            requireActivity().finish()
        }
    }
}