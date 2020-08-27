package com.example.commons

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class BaseViewHolder<MODEL>(private val binding: ViewDataBinding, private val itemVariableId: Int) :
    RecyclerView.ViewHolder(binding.root) {

    fun bindItem(item: MODEL) {
        binding.setVariable(itemVariableId, item)
        binding.executePendingBindings()
    }
}