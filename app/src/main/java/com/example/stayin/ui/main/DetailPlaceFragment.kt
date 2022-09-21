package com.example.stayin.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stayin.R
import com.example.stayin.data.models.Destinations
import com.example.stayin.data.models.Itinerary
import com.example.stayin.data.models.People
import com.example.stayin.databinding.FragmentDetailPlaceBinding
import com.example.stayin.databinding.ItemBottomReviewBinding
import com.example.stayin.databinding.SheetDetailPlaceBinding
import com.example.stayin.ui.main.adapters.*
import com.google.android.material.bottomsheet.BottomSheetDialog


class DetailPlaceFragment : Fragment(R.layout.fragment_detail_place) {
    private lateinit var binding: FragmentDetailPlaceBinding
    private val destinationsList =
        listOf(
            Destinations(R.drawable.parrot_2),
            Destinations(R.drawable.disney),
            Destinations(R.drawable.park)
        )
    private val reviewList =
        listOf(
            Destinations(R.drawable.serena),
            Destinations(R.drawable.serena)
        )
    private val toVisitList =
        listOf(
            Destinations(R.drawable.park_green),
            Destinations(R.drawable.castle),
            Destinations(R.drawable.party),
            Destinations(R.drawable.disney_castle)
        )
    private val itineraryList =
        listOf(
            Itinerary("Disneyland Paris", "Day 1"),
            Itinerary("Cruise on the Seine", "Day 2"),
            Itinerary("Palace of Versailles", "Day 3")
        )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailPlaceBinding.bind(view)


        setDestinations()
        setToVisit()
        setItinerary()
        setReviews()
        clicks()
    }

    private fun setReviews() {
        binding.rvReviews.adapter = ReviewsAdapter(reviewList)
        binding.rvReviews.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun setItinerary() {
        binding.rvItinerary.adapter = ItineraryAdapter(itineraryList)
        binding.rvItinerary.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun setToVisit() {
        binding.rvToVisit.adapter = ToVisitAdapter(toVisitList)
        binding.rvToVisit.layoutManager = GridLayoutManager(requireContext(), 2)
    }

    private fun clicks() {
        binding.textView15.setOnClickListener { changeViewVisit() }
        binding.textView13.setOnClickListener { changeViewDisney() }
        binding.textView16.setOnClickListener { changeViewItinerary() }
        binding.textView38.setOnClickListener { changeViewReview() }
        binding.btnAddReview.setOnClickListener { createBottomSheet() }
    }

    private fun createBottomSheet() {
        val dialog = ItemBottomReviewBinding.inflate(LayoutInflater.from(requireContext()))
        val bottomDialog = BottomSheetDialog(requireContext(),R.style.BottomSheetDialogTheme).apply {
            setContentView(dialog.root)
        }
        dialog.txtDone.setOnClickListener {
            bottomDialog.dismiss()
            findNavController().navigate(R.id.action_detailPlaceFragment_to_bookingNowFragment) }
        dialog.imgClose.setOnClickListener { bottomDialog.dismiss() }
        bottomDialog.show()
    }

    private fun changeViewReview() {
        binding.textView13.setTextColor(resources.getColor(R.color.gray_1, null))
        binding.textView15.setTextColor(resources.getColor(R.color.gray_1, null))
        binding.textView16.setTextColor(resources.getColor(R.color.gray_1, null))
        binding.textView38.setTextColor(resources.getColor(R.color.dark_blue_200, null))
        binding.textView30.text = "Review"
        binding.llDisneyland.visibility = View.GONE
        binding.rvToVisit.visibility = View.GONE
        binding.rvItinerary.visibility = View.GONE
        binding.llReview.visibility = View.VISIBLE
    }

    private fun changeViewItinerary() {
        binding.textView13.setTextColor(resources.getColor(R.color.gray_1, null))
        binding.textView15.setTextColor(resources.getColor(R.color.gray_1, null))
        binding.textView16.setTextColor(resources.getColor(R.color.dark_blue_200, null))
        binding.textView38.setTextColor(resources.getColor(R.color.gray_1, null))
        binding.textView30.text = "Places To Visit"
        binding.llDisneyland.visibility = View.GONE
        binding.rvToVisit.visibility = View.GONE
        binding.rvItinerary.visibility = View.VISIBLE
        binding.llReview.visibility = View.GONE

    }

    private fun changeViewDisney() {
        binding.textView13.setTextColor(resources.getColor(R.color.dark_blue_200, null))
        binding.textView15.setTextColor(resources.getColor(R.color.gray_1, null))
        binding.textView16.setTextColor(resources.getColor(R.color.gray_1, null))
        binding.textView38.setTextColor(resources.getColor(R.color.gray_1, null))
        binding.textView30.text = "Disneyland Paris"
        binding.llDisneyland.visibility = View.VISIBLE
        binding.rvToVisit.visibility = View.GONE
        binding.rvItinerary.visibility = View.GONE
        binding.llReview.visibility = View.GONE

    }

    private fun changeViewVisit() {
        binding.textView13.setTextColor(resources.getColor(R.color.gray_1, null))
        binding.textView15.setTextColor(resources.getColor(R.color.dark_blue_200, null))
        binding.textView16.setTextColor(resources.getColor(R.color.gray_1, null))
        binding.textView38.setTextColor(resources.getColor(R.color.gray_1, null))
        binding.textView30.text = "Places To Visit"
        binding.llDisneyland.visibility = View.GONE
        binding.rvToVisit.visibility = View.VISIBLE
        binding.rvItinerary.visibility = View.GONE
        binding.llReview.visibility = View.GONE

    }

    private fun setDestinations() {
        binding.rvDestinations.adapter = DestinationsAdapter(destinationsList)
        binding.rvDestinations.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
    }

}