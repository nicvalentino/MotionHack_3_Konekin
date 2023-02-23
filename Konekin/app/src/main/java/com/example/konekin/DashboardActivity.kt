package com.example.konekin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.konekin.databinding.ActivityDashboardBinding
import com.example.konekin.fragments.ActivityFragment
import com.example.konekin.fragments.HomeFragment
import com.example.konekin.fragments.ProfilFragment
import com.example.konekin.fragments.RewardFragment

class DashboardActivity : AppCompatActivity() {
    private val homeFragment = HomeFragment()
    private val activityFragment = ActivityFragment()
    private val rewardFragment = RewardFragment()
    private val profilFragment = ProfilFragment()
    private lateinit var binding : ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_dashboard)

        setContentView(binding.root)
        replaceFragment(homeFragment)

        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home_Fragment -> replaceFragment(homeFragment)
                R.id.activity_Fragment -> replaceFragment(activityFragment)
                R.id.reward_Fragment -> replaceFragment(rewardFragment)
                R.id.profil_Fragment -> replaceFragment(profilFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }
}