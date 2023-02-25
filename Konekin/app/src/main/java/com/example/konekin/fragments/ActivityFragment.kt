package com.example.konekin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import com.example.konekin.R
import com.example.konekin.adapter.ActivityPagerAdapter
import com.example.konekin.databinding.FragmentActivityBinding
import com.example.konekin.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayout

class ActivityFragment : Fragment() {

    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout
    private lateinit var binding: FragmentActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentActivityBinding.inflate(inflater, container, false)

//        binding.activityTabLayout.addTab(tabLayout.newTab().setText("Akan Berlangsung"))
//        binding.activityTabLayout.addTab(tabLayout.newTab().setText("Riwayat"))

        val adapter = ActivityPagerAdapter(childFragmentManager)

        adapter.addFragment(OngoingActivityFragment(), "Akan Berlangsung")
        adapter.addFragment(HistoryActivityFragment(), "Riwayat")

        binding.activityViewPager.adapter = adapter

        binding.activityTabLayout.setupWithViewPager(binding.activityViewPager)

//        val adapter = ActivityPagerAdapter(childFragmentManager)

        return binding.root
    }
}
