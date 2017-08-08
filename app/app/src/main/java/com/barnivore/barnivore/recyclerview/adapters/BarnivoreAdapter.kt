package com.barnivore.barnivore.recyclerview.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.barnivore.barnivore.R
import com.barnivore.barnivore.models.Liquor
import com.barnivore.barnivore.recyclerview.adapters.viewholders.BarnivoreViewHolder

/**
 *
 * Created by jessescott on 2017-08-08.
 *
 */


class BarnivoreAdapter(val items: List<Liquor>) : RecyclerView.Adapter<BarnivoreViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BarnivoreViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_liquor, parent, false)
        return BarnivoreViewHolder(view)
    }

    override fun onBindViewHolder(holder: BarnivoreViewHolder?, position: Int) {
        holder?.bindItems(items[position])
    }

    override fun getItemCount(): Int = items.size

}