package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.data.models.Cities
import com.example.stayin.databinding.ItemCitiesBinding
import com.example.stayin.databinding.ItemDiscountsBinding

class DiscountsAdapter (private val list: List<Discounts>) : RecyclerView.Adapter<DiscountsAdapter.DiscountsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscountsViewHolder {
        val binding =
            ItemDiscountsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DiscountsViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: DiscountsViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class DiscountsViewHolder(private val binding: ItemDiscountsBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Discounts) {
            binding.txtTitle.text = item.title
            binding.txtSubTitle.text = item.subTitle
            binding.txt1.text = item.text
        }
    }
}