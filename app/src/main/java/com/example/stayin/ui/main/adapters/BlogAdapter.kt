package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.data.models.Blog
import com.example.stayin.data.models.Places
import com.example.stayin.databinding.ItemBlogBinding
import com.example.stayin.databinding.ItemPlacesBinding

class BlogAdapter (private val list: List<Blog>) : RecyclerView.Adapter<BlogAdapter.BlogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        val binding =
            ItemBlogBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BlogViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class BlogViewHolder(private val binding: ItemBlogBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Blog) {
            binding.txtTitle.text = item.title
            binding.txtCountry.text = item.country
            binding.txtDate.text = item.date
            binding.txtText.text = item.text
            binding.imgBackground.setBackgroundResource(item.image)
        }
    }
}