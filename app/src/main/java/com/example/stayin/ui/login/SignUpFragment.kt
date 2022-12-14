package com.example.stayin.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.stayin.R
import com.example.stayin.databinding.FragmentSignInBinding
import com.example.stayin.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment(R.layout.fragment_sign_up) {
    private lateinit var binding: FragmentSignUpBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignUpBinding.bind(view)
        clicks()
    }

    private fun clicks() {
        binding.imgNext.setOnClickListener { findNavController().popBackStack(R.id.signInFragment,false) }
        binding.txtSignIn.setOnClickListener { findNavController().popBackStack(R.id.signInFragment,false) }
    }
}