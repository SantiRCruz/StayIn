package com.example.stayin.ui.main.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.stayin.R
import com.example.stayin.databinding.FragmentInviteFriendsBinding
import com.example.stayin.databinding.ItemLanguageBinding

class InviteFriendsFragment : Fragment(R.layout.fragment_invite_friends) {
    private lateinit var binding: FragmentInviteFriendsBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentInviteFriendsBinding.bind(view)

    }
    
}