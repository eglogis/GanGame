package com.example.commons

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class BaseRecyclerAdapter<MODEL>(private val itemVariableId: Int, private val layoutId: Int) :
    RecyclerView.Adapter<BaseViewHolder<MODEL>>() {

    val items = mutableListOf<MODEL>()

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<MODEL> {
        val binding: ViewDataBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context), layoutId, parent,
                false
        )
        return BaseViewHolder(binding, itemVariableId)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<MODEL>, position: Int) {
        val item = items[position]
        holder.bindItem(item)
    }
}