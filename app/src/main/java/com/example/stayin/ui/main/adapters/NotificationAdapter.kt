package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.data.models.Notification
import com.example.stayin.databinding.ItemNotificationBinding

class NotificationAdapter (private val list: List<Notification>) : RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val binding =
            ItemNotificationBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NotificationViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class NotificationViewHolder(private val binding: ItemNotificationBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Notification) {
            binding.imgBackground.setBackgroundResource(item.image)
        }
    }
}