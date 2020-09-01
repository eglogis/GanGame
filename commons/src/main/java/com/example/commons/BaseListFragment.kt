package com.example.commons

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_base_list.*

abstract class BaseListFragment : BaseFragment() {

    lateinit var listAdapter: RecyclerView.Adapter<*>

    override fun getLayoutId(): Int {
        return R.layout.fragment_base_list
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpList()
    }

    private fun setUpList() {
        listAdapter = getAdapter()
        list.adapter = listAdapter
        list.layoutManager = LinearLayoutManager(context)
    }

    abstract fun getAdapter(): RecyclerView.Adapter<*>
}