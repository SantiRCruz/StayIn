package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.data.models.Destinations
import com.example.stayin.data.models.Itinerary
import com.example.stayin.databinding.ItemItineraryBinding
import com.example.stayin.databinding.ItemReviewsBinding

class ReviewsAdapter (private val list: List<Destinations>) : RecyclerView.Adapter<ReviewsAdapter.ReviewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewsViewHolder {
        val binding =
            ItemReviewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ReviewsViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: ReviewsViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class ReviewsViewHolder(private val binding: ItemReviewsBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Destinations) {
            binding.imgBackground.setImageResource(item.image)
        }
    }
}