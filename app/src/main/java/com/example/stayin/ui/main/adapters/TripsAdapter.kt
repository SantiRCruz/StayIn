package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.data.models.Notification
import com.example.stayin.databinding.ItemNotificationBinding
import com.example.stayin.databinding.ItemTripsBinding

class TripsAdapter (private val list: List<Notification>) : RecyclerView.Adapter<TripsAdapter.TripsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripsViewHolder {
        val binding =
            ItemTripsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TripsViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: TripsViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class TripsViewHolder(private val binding: ItemTripsBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Notification) {
            binding.imgBackground.setBackgroundResource(item.image)
        }
    }
}