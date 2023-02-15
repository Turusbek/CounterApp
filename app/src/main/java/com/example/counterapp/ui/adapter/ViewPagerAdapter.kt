package com.example.counterapp.ui.adapter

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.counterapp.ui.fragment.MainFragment
import com.example.counterapp.ui.fragment.ResultFragment
import com.example.counterapp.ui.fragment.HistoryFragment


class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                MainFragment()
            }
            1 -> {
                ResultFragment()
            }
            2 -> {
                HistoryFragment()
            }
            else -> {
                throw Resources.NotFoundException("Position Not Found")
            }
        }
    }

}