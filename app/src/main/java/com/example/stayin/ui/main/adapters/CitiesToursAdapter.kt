package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.R
import com.example.stayin.data.models.Cities import com.example.stayin.data.models.GradientLocation
import com.example.stayin.databinding.ItemCitiesBinding

class CitiesToursAdapter (private val list: List<Cities>) :
    RecyclerView.Adapter<CitiesToursAdapter.CitiesToursViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitiesToursViewHolder {
        val binding =
            ItemCitiesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CitiesToursViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: CitiesToursViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class CitiesToursViewHolder(private val binding: ItemCitiesBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Cities) {
            binding.txtTitle.text = item.title
            binding.imgBackground.setImageResource(item.image)
            binding.root.setOnClickListener {
                if (item.title == "Paris") Navigation.findNavController(binding.root).navigate(R.id.action_toursFragment_to_placesFragment)
            }
        }
    }
}