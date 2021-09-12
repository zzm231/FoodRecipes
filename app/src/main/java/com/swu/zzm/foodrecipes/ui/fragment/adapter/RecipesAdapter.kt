package com.swu.zzm.foodrecipes.ui.fragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.swu.zzm.foodrecipes.R

class RecipesAdapter: RecyclerView.Adapter<RecipesAdapter.MyViewHolder>() {
    class MyViewHolder(item:View):RecyclerView.ViewHolder(item){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.recipes_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }
}