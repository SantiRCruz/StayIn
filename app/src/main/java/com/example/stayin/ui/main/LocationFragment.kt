package com.example.stayin.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stayin.R
import com.example.stayin.data.models.GradientLocation
import com.example.stayin.data.models.Location
import com.example.stayin.databinding.ActivityHomeBinding
import com.example.stayin.databinding.FragmentLocationBinding
import com.example.stayin.ui.main.adapters.CitiesAdapter

class LocationFragment : Fragment(R.layout.fragment_location) {
    private lateinit var binding: FragmentLocationBinding
    private val citiesList =
        listOf<Location>(
            Location("USA", "NEW YORK", R.drawable.new_york, GradientLocation.ORANGE),
            Location("France", "Paris", R.drawable.paris, GradientLocation.BLUE),
            Location("India", "Agra", R.drawable.agra, GradientLocation.GREEN),
            Location("England", "London", R.drawable.london, GradientLocation.YELLOW),
            Location("Australia", "Sydney", R.drawable.sydney, GradientLocation.RED),

        )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLocationBinding.bind(view)

        setCities()

    }

    private fun setCities() {
        binding.rvCities.adapter = CitiesAdapter(citiesList)
        binding.rvCities.layoutManager = LinearLayoutManager(requireContext())

    }

}