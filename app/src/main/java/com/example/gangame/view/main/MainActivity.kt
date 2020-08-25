package com.example.gangame.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.gangame.R
import com.example.gangame.view.deals.DealsFragment
import com.example.gangame.view.mostOwned.MostOwnedFragment
import com.example.gangame.view.topRated.TopRatedFragment
import kotlinx.android.synthetic.main.activity_main.*

const val DEFAULT_MENU_ITEM = R.id.actionDeals

class MainActivity : AppCompatActivity() {

    lateinit var router: MainRouter

    private val fragments: HashMap<Int, Fragment> = hashMapOf(
        Pair(R.id.actionDeals, DealsFragment()),
        Pair(R.id.actionMostOwned, MostOwnedFragment()),
        Pair(R.id.actionTopRated, TopRatedFragment())
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        router = MainRouter(this, R.id.fragmentContainer)
        addDefaultFragment()
        setMenuDefaultItem()
        setNavigationItemSelected()
    }

    private fun setMenuDefaultItem() {
        navigationView.selectedItemId = DEFAULT_MENU_ITEM
    }

    private fun setNavigationItemSelected() {
        navigationView.setOnNavigationItemSelectedListener {
            val fragmentSelected = fragments[it.itemId]
            if (!router.isFragmentNull(fragmentSelected)) {
                router.replaceFragment(fragmentSelected!!)
            }
            true
        }
    }

    private fun addDefaultFragment() {
        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)
        if (router.isFragmentNull(currentFragment)) {
            fragments[DEFAULT_MENU_ITEM]?.let {
                router.addFragment(DealsFragment())
            }
        }
    }
}