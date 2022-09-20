package com.example.stayin.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.R
import com.example.stayin.data.models.*
import com.example.stayin.databinding.FragmentToursBinding
import com.example.stayin.databinding.ItemLocationBinding
import com.example.stayin.ui.main.adapters.*


class ToursFragment : Fragment(R.layout.fragment_tours) {
    private lateinit var binding: FragmentToursBinding
    private val discountsList =
        listOf(
            Discounts("Holiday","Say yes to iconic snow Catamount, Hillsdale, New York!","Book your holiday package today"),
            Discounts("Holiday","Say yes to iconic snow Catamount, Hillsdale, New York!","Book your holiday package today"),
            Discounts("Holiday","Say yes to iconic snow Catamount, Hillsdale, New York!","Book your holiday package today"),
        )
    private val citiesList =
        listOf(
            Cities("Paris",R.drawable.paris_2 ),
            Cities("India",R.drawable.india ),
            Cities("New York",R.drawable.new_york_2 ),
            Cities("Los Angeles", R.drawable.los_angeles),
            Cities("Chongqing",R.drawable.chongqing ),
            Cities("Bogota", R.drawable.bogota),
            Cities("Buenos Aires", R.drawable.buenos_aires),
            )

    private val placesList =
        listOf(
            Places("Eiffel Towers",R.drawable.tower ),
            Places("Parrot Cay",R.drawable.parrot ),
            Places("Notre Dam",R.drawable.notre ),
        )
    private val blogList =
        listOf(
            Blog("Byron Bay","Australia","20 Dec, 2019","A popular tourist destination, it’s characterized by its many beaches and hinterland.",R.drawable.beach),
            Blog("Burj AI Arab","Dubai","20 Dec, 2019","A popular tourist destination, it’s characterized by its many beaches and hinterland.",R.drawable.arab),
        )
    private val searchList =
        listOf(
            Search("Great Barrier Reef","Australia","4.8 (512 Reviews)",R.drawable.sea),
            Search("Pyramids of Giza","Egypt","4.8 (512 Reviews)",R.drawable.pyramid),
            Search("Bora Bora Tourism","Polynesia","4.8 (512 Reviews)",R.drawable.bora),
            Search("The heritage of England","London","4.8 (512 Reviews)",R.drawable.heritage)
        )
    private val peopleList =
        listOf(
            People("Matt Hardy","Sed tortor ante, this is vestibulum non crisus id, porta imperdiet purus.",R.drawable.matt),
            People("Renato Abati","Sed tortor ante, this is vestibulum non crisus id, porta imperdiet purus.",R.drawable.renato),
            People("Luanna Cabral","Sed tortor ante, this is vestibulum non crisus id, porta imperdiet purus.",R.drawable.luana),
        )
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentToursBinding.bind(view)

        setCities()
        setDiscounts()
        setPlaces()
        setBlog()
        setSearch()
        setPeople()


    }

    private fun setPeople() {
        binding.rvPeople.adapter = PeopleAdapter(peopleList)
        binding.rvPeople.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
    }

    private fun setSearch() {
        binding.rvSearch.adapter = SearchAdapter(searchList)
        binding.rvSearch.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun setBlog() {
        binding.rvBlog.adapter = BlogAdapter(blogList)
        binding.rvBlog.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
    }

    private fun setPlaces() {
        binding.rvPlaces.adapter = PlacesAdapter(placesList)
        binding.rvPlaces.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
    }

    private fun setDiscounts() {
        binding.rvCities.adapter = CitiesToursAdapter(citiesList)
        binding.rvCities.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
    }

    private fun setCities() {
        binding.rvDiscount.adapter = DiscountsAdapter(discountsList)
        binding.rvDiscount.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
    }

}