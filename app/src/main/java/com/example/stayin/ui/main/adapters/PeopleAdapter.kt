package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.data.models.Blog
import com.example.stayin.data.models.People
import com.example.stayin.databinding.ItemBlogBinding
import com.example.stayin.databinding.ItemPeopleBinding

class PeopleAdapter (private val list: List<People>) : RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        val binding =
            ItemPeopleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PeopleViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class PeopleViewHolder(private val binding: ItemPeopleBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: People) {
            binding.txtName.text = item.name
            binding.txtText.text = item.text
            binding.imgBackground.setBackgroundResource(item.image)
        }
    }
}