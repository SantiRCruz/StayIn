package com.example.stayin.ui.main.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.stayin.R
import com.example.stayin.data.models.ToursPlaces
import com.example.stayin.databinding.ItemToursPlacesBinding
import com.example.stayin.databinding.SheetDetailPlaceBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class TourPlacesAdapter (private val list: List<ToursPlaces>) : RecyclerView.Adapter<TourPlacesAdapter.TourPlacesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourPlacesViewHolder {
        val binding =
            ItemToursPlacesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TourPlacesViewHolder(binding,parent.context)
    }

    override fun onBindViewHolder(holder: TourPlacesViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class TourPlacesViewHolder(private val binding: ItemToursPlacesBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ToursPlaces) {
            binding.txtTitle.text = item.title
            binding.imgBackground.setBackgroundResource(item.image)
            binding.root.setOnClickListener {
                val dialog = SheetDetailPlaceBinding.inflate(LayoutInflater.from(context))
                val bottomDialog = BottomSheetDialog(context, R.style.BottomSheetDialogTheme).apply {
                    setContentView(dialog.root)
                }
                dialog.imgClose.setOnClickListener { bottomDialog.dismiss() }
                dialog.txtTitle.text = item.title
                dialog.txtDone.setOnClickListener {
                    bottomDialog.dismiss()
                    Navigation.findNavController(binding.root).navigate(R.id.action_placesFragment_to_chooseDatesFragment)
                }
                bottomDialog.show()

            }
        }
    }
}