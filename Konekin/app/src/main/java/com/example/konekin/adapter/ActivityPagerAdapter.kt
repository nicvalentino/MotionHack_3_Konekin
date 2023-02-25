package com.example.konekin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.konekin.fragments.HistoryActivityFragment
import com.example.konekin.fragments.OngoingActivityFragment

class ActivityPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

//    private val fragments = listOf(
//        OngoingActivityFragment(),
//        HistoryActivityFragment()
//    )
//    private val titles = listOf(
//        "Akan berlangsung",
//        "Riwayat"
//    )

    private val fragments = mutableListOf<Fragment>()
    private val titles = mutableListOf<String>()


    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> OngoingActivityFragment()
            1 -> HistoryActivityFragment()
            else -> OngoingActivityFragment()
        }
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return titles[position]
    }

    fun addFragment(fragment: Fragment, title: String) {
        fragments.add(fragment)
        titles.add(title)
    }

}