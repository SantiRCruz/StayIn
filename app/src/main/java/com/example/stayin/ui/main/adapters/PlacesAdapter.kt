package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.data.models.Places
import com.example.stayin.databinding.ItemDiscountsBinding
import com.example.stayin.databinding.ItemPlacesBinding

class PlacesAdapter(private val list: List<Places>) : RecyclerView.Adapter<PlacesAdapter.PlacesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlacesViewHolder {
        val binding =
            ItemPlacesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlacesViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: PlacesViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class PlacesViewHolder(private val binding: ItemPlacesBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Places) {
            binding.txtTitle.text = item.title
            binding.imgBackground.setBackgroundResource(item.image)
        }
    }
}