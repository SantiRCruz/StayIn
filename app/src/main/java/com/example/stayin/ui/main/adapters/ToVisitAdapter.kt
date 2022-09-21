package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.R
import com.example.stayin.data.models.Destinations
import com.example.stayin.data.models.ToursPlaces
import com.example.stayin.databinding.ItemToVisitBinding
import com.example.stayin.databinding.ItemToursPlacesBinding
import com.example.stayin.databinding.SheetDetailPlaceBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class ToVisitAdapter(private val list: List<Destinations>) : RecyclerView.Adapter<ToVisitAdapter.ToVisitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToVisitViewHolder {
        val binding =
            ItemToVisitBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ToVisitViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: ToVisitViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class ToVisitViewHolder(private val binding: ItemToVisitBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Destinations) {
            binding.imgBackground.setBackgroundResource(item.image)
        }
    }
}