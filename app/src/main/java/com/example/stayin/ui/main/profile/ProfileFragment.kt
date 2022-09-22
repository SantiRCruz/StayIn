package com.example.stayin.ui.main.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.stayin.R
import com.example.stayin.databinding.FragmentProfileBinding


class ProfileFragment : Fragment(R.layout.fragment_profile) {
        private lateinit var binding: FragmentProfileBinding
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                super.onViewCreated(view, savedInstanceState)
                binding = FragmentProfileBinding.bind(view)
                clicks()

        }

        private fun clicks() {
                binding.llNotification.setOnClickListener { findNavController().navigate(R.id.action_profileFragment_to_notificationsFragment) }
                binding.llLanguage.setOnClickListener { findNavController().navigate(R.id.action_profileFragment_to_languageFragment) }
                binding.llInviteFriends.setOnClickListener { findNavController().navigate(R.id.action_profileFragment_to_inviteFriendsFragment) }
                binding.llSettings.setOnClickListener { findNavController().navigate(R.id.action_profileFragment_to_settingsFragment) }
                binding.llTours.setOnClickListener { findNavController().navigate(R.id.action_profileFragment_to_myTripFragment) }
        }

}