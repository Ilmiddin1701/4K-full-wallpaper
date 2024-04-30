package com.example.a4kfullwallpaper.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a4kfullwallpaper.databinding.ItemRvBinding
import com.example.a4kfullwallpaper.models.DataRv

class RvAdapter (var rvAction: RvAction,var list: List<DataRv>): RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(var itemRvBinding: ItemRvBinding) : RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBinding(dataRv: DataRv, position: Int) {
            itemRvBinding.imageRvItem.setImageResource(dataRv.image)
            itemRvBinding.imageRvItem.setOnClickListener {
                rvAction.imageClick(dataRv, position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBinding(list[position], position)
    }

    interface RvAction{
        fun imageClick(dataRv: DataRv, position: Int)
    }
}