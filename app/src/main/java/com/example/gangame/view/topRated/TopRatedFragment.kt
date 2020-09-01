package com.example.gangame.view.topRated

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.commons.BaseFragment
import com.example.commons.BaseListFragment
import com.example.commons.BaseRecyclerAdapter
import com.example.gangame.BR
import com.example.gangame.R
import com.example.gangame.data.TopGame

class TopRatedFragment : BaseListFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (listAdapter as BaseRecyclerAdapter<TopGame>).items.addAll(getTestMostOwner())
        listAdapter.notifyDataSetChanged()
    }

    override fun getAdapter(): RecyclerView.Adapter<*> {
        return BaseRecyclerAdapter<TopGame>(BR.topGame, R.layout.item_top_game)
    }

    private fun getTestMostOwner(): ArrayList<TopGame> {
        return arrayListOf(
            TopGame(
                "Counter Strike", 20, 80,
                "Valve", 0.99F, 1,
                "https://www.playerone.vg/wp-content/uploads/2020/04/counter-strike-valve-jugadores-record2-1.png"
            )
        )
    }
}