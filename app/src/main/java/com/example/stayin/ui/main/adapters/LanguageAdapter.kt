package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.R
import com.example.stayin.data.models.Language
import com.example.stayin.data.models.Notification
import com.example.stayin.databinding.ItemLanguageBinding
import com.example.stayin.databinding.ItemNotificationBinding

class LanguageAdapter(private val list: List<Language>) :
    RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val binding =
            ItemLanguageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LanguageViewHolder(binding, parent.context)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class LanguageViewHolder(
        private val binding: ItemLanguageBinding,
        private val context: Context
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Language) {
            binding.txtTitle.text = item.title
            binding.llBackground.setBackgroundResource(item.color)
        }
    }
}