package com.example.a4kfullwallpaper.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a4kfullwallpaper.R
import com.example.a4kfullwallpaper.models.DataVp

class VpAdapter(var vpAction: VpAction, var list: List<DataVp>) : RecyclerView.Adapter<VpAdapter.Vh>() {
    inner class Vh(itemView: View):RecyclerView.ViewHolder(itemView){
        fun onBind(dataVp: DataVp){
            vpAction.rvAdapter(itemView.findViewById(R.id.rv))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_vp, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    interface VpAction{
        fun rvAdapter(recyclerView: RecyclerView)
    }
}