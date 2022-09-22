package com.example.stayin.ui.main.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stayin.R
import com.example.stayin.data.models.Notification
import com.example.stayin.databinding.FragmentInviteFriendsBinding
import com.example.stayin.databinding.FragmentMyTripBinding
import com.example.stayin.ui.main.adapters.NotificationAdapter
import com.example.stayin.ui.main.adapters.TripsAdapter


class MyTripFragment : Fragment(R.layout.fragment_my_trip) {
    private lateinit var binding: FragmentMyTripBinding
    private val tripsList =
        listOf(
            Notification(R.drawable.tower_1 ),
            Notification(R.drawable.tower_1 ),
            Notification(R.drawable.tower_1 ),
        )
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMyTripBinding.bind(view)

        setTrips()
    }

    private fun setTrips() {
        binding.rvTrips.adapter = TripsAdapter(tripsList)
        binding.rvTrips.layoutManager = LinearLayoutManager(requireContext())
    }

}