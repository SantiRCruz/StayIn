package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.data.models.Itinerary
import com.example.stayin.databinding.ItemItineraryBinding

class ItineraryAdapter (private val list: List<Itinerary>) : RecyclerView.Adapter<ItineraryAdapter.ItineraryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItineraryViewHolder {
        val binding =
            ItemItineraryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItineraryViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: ItineraryViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class ItineraryViewHolder(private val binding: ItemItineraryBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Itinerary) {
            binding.txtTitle.text = item.title
            binding.txtDay.text = item.day
        }
    }
}