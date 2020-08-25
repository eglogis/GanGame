package com.example.gangame.view.main

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.gangame.R

class MainRouter(
    activity: AppCompatActivity,
    private val containerId: Int = R.id.fragmentContainer
) {

    private val fragmentManager: FragmentManager = activity.supportFragmentManager

    fun replaceFragment(fragment: Fragment) {
        fragmentManager
            .beginTransaction()
            .replace(containerId, fragment)
            .commit()
    }

    fun addFragment(fragment: Fragment) {
        fragmentManager
            .beginTransaction()
            .add(containerId, fragment)
            .commit()
    }

    fun isFragmentNull(fragment: Fragment?): Boolean {
        return fragment == null
    }
}