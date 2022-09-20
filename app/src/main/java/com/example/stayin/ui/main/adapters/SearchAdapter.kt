package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.data.models.Search
import com.example.stayin.databinding.ItemSearchBinding

class SearchAdapter(private val list: List<Search>) : RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val binding =ItemSearchBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SearchViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class SearchViewHolder(private val binding:ItemSearchBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Search) {
            binding.txtTitle.text = item.title
            binding.txtCountry.text = item.Country
            binding.txtReviews.text = item.reviews
            binding.imgBackground.setBackgroundResource(item.image)
        }
    }
}