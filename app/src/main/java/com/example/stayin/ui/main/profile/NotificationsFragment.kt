package com.example.stayin.ui.main.profile

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stayin.R
import com.example.stayin.data.models.Notification
import com.example.stayin.data.models.Places
import com.example.stayin.databinding.FragmentNotificationsBinding
import com.example.stayin.databinding.FragmentProfileBinding
import com.example.stayin.ui.main.adapters.NotificationAdapter
import com.example.stayin.ui.main.adapters.SearchAdapter


class NotificationsFragment : Fragment(R.layout.fragment_notifications) {
    private lateinit var binding: FragmentNotificationsBinding
    private val notificationList =
        listOf(
            Notification(R.drawable.matt ),
            Notification(R.drawable.matt ),
            Notification(R.drawable.matt ),
            Notification(R.drawable.matt ),
            Notification(R.drawable.matt )
        )
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNotificationsBinding.bind(view)

        setNotifications()
    }

    private fun setNotifications() {
        binding.rvNotification.adapter = NotificationAdapter(notificationList)
        binding.rvNotification.layoutManager = LinearLayoutManager(requireContext())
    }

}