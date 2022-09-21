package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.R
import com.example.stayin.data.models.Destinations
import com.example.stayin.data.models.ToursPlaces
import com.example.stayin.databinding.ItemDestinationBinding
import com.example.stayin.databinding.ItemToursPlacesBinding
import com.example.stayin.databinding.SheetDetailPlaceBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class DestinationsAdapter(private val list: List<Destinations>) : RecyclerView.Adapter<DestinationsAdapter.DestinationsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationsViewHolder {
        val binding =
            ItemDestinationBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DestinationsViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: DestinationsViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class DestinationsViewHolder(private val binding: ItemDestinationBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Destinations) {
            binding.imgBackground.setBackgroundResource(item.image)
        }
    }
}