package com.example.gangame.view.deals

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.commons.BaseListFragment
import com.example.commons.BaseRecyclerAdapter
import com.example.gangame.BR
import com.example.gangame.R
import com.example.gangame.data.Deal

class DealsFragment : BaseListFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (listAdapter as BaseRecyclerAdapter<Deal>).items.addAll(getTestDeals())
        listAdapter.notifyDataSetChanged()
    }

    override fun getAdapter(): RecyclerView.Adapter<*> {
        return BaseRecyclerAdapter<Deal>(BR.deal, R.layout.item_deal_game)
    }

    private fun getTestDeals(): ArrayList<Deal> {
        return arrayListOf(
            Deal(
                "Counter Strike", 0.99F, 0.99F,
                80, 80,
                "https://www.playerone.vg/wp-content/uploads/2020/04/counter-strike-valve-jugadores-record2-1.png"
            )
        )
    }
}