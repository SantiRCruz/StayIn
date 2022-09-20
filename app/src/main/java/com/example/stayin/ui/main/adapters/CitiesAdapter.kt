package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.R
import com.example.stayin.data.models.GradientLocation
import com.example.stayin.data.models.Location
import com.example.stayin.databinding.ItemLocationBinding

class CitiesAdapter(private val list: List<Location>) :
    RecyclerView.Adapter<CitiesAdapter.CitiesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitiesViewHolder {
        val binding =
            ItemLocationBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CitiesViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: CitiesViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class CitiesViewHolder(private val binding: ItemLocationBinding,private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Location) {
            binding.txtTitle.text = item.title
            binding.txtSubTitle.text = item.subTitle
            binding.imgBackground.setImageResource(item.image)
            when (item.color) {
                GradientLocation.ORANGE -> {
                    binding.gradient.background = context.getDrawable(R.drawable.gradient_orange)
                }
                GradientLocation.RED -> {
                    binding.gradient.background = context.getDrawable(R.drawable.gradient_red)
                }
                GradientLocation.GREEN -> {
                    binding.gradient.background = context.getDrawable(R.drawable.gradient_green)
                }
                GradientLocation.BLUE -> {
                    binding.gradient.background = context.getDrawable(R.drawable.gradient_blue)
                }
                GradientLocation.YELLOW -> {
                    binding.gradient.background = context.getDrawable(R.drawable.gradient_yellow)
                }
            }
        }
    }
}