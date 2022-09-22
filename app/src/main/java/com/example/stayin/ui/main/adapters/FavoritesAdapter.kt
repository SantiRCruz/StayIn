package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.data.models.Notification
import com.example.stayin.databinding.ItemFavoriteBinding
import com.example.stayin.databinding.ItemTripsBinding

class FavoritesAdapter (private val list: List<Notification>) : RecyclerView.Adapter<FavoritesAdapter.FavoritesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoritesViewHolder {
        val binding =
            ItemFavoriteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FavoritesViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: FavoritesViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class FavoritesViewHolder(private val binding: ItemFavoriteBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Notification) {
            binding.imgBackground.setBackgroundResource(item.image)
        }
    }
}