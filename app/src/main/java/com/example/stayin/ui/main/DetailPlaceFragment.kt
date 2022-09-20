package com.example.stayin.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.stayin.R
import com.example.stayin.databinding.FragmentDetailPlaceBinding
import com.example.stayin.databinding.SheetDetailPlaceBinding


class DetailPlaceFragment : Fragment(R.layout.fragment_detail_place) {
    private lateinit var binding: FragmentDetailPlaceBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailPlaceBinding.bind(view)

    }

}