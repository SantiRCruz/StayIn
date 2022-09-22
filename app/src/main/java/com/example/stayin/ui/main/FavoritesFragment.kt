package com.example.stayin.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stayin.R
import com.example.stayin.data.models.Notification
import com.example.stayin.databinding.FragmentFavoritesBinding
import com.example.stayin.ui.main.adapters.FavoritesAdapter
import com.example.stayin.ui.main.adapters.TripsAdapter


class FavoritesFragment : Fragment(R.layout.fragment_favorites) {
    private lateinit var binding : FragmentFavoritesBinding
    private val favoritesList =
        listOf(
            Notification(R.drawable.sea ),
            Notification(R.drawable.tower2 ),
            Notification(R.drawable.disney_castle ),
            Notification(R.drawable.tower ),
            Notification(R.drawable.barrier ),
        )
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFavoritesBinding.bind(view)

        setFavorites()
    }

    private fun setFavorites() {
        binding.rvFavorites.adapter = FavoritesAdapter(favoritesList)
        binding.rvFavorites.layoutManager = LinearLayoutManager(requireContext())
    }

}