package com.example.stayin.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stayin.R
import com.example.stayin.data.models.People
import com.example.stayin.data.models.ToursPlaces
import com.example.stayin.databinding.FragmentPlacesBinding
import com.example.stayin.ui.main.adapters.BlogAdapter
import com.example.stayin.ui.main.adapters.TourPlacesAdapter


class PlacesFragment : Fragment(R.layout.fragment_places) {
    private lateinit var binding: FragmentPlacesBinding
    private val placesList =
        listOf(
            ToursPlaces("Eiffel Tower",R.drawable.tower2),
            ToursPlaces("Palace of Versailles",R.drawable.versailles),
            ToursPlaces("Disneyland Paris",R.drawable.disneyland),
            ToursPlaces("Cruise on the Seine",R.drawable.seine),
        )
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPlacesBinding.bind(view)

        setPlaces()

    }

    private fun setPlaces() {
        binding.rvPlaces.adapter = TourPlacesAdapter(placesList)
        binding.rvPlaces.layoutManager = LinearLayoutManager(requireContext())
    }

}