package com.example.stayin.ui.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.stayin.R
import com.example.stayin.databinding.FragmentOnBoarding2Binding
import com.example.stayin.databinding.FragmentOnBoarding3Binding
import com.example.stayin.LoginActivity

class OnBoarding3Fragment : Fragment(R.layout.fragment_on_boarding3) {
    private lateinit var binding: FragmentOnBoarding3Binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOnBoarding3Binding.bind(view)

        clicks()
    }

    private fun clicks() {
        binding.txtLetsGo.setOnClickListener {
            startActivity(Intent(requireActivity(), LoginActivity::class.java))
            requireActivity().finish()
        }
    }
}