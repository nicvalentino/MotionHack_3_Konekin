package com.example.konekin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.konekin.databinding.ActivityRewardSuccessBinding
import com.example.konekin.databinding.FragmentRewardBinding
import com.example.konekin.fragments.RewardFragment

class RewardSuccessActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRewardSuccessBinding
    private lateinit var bindingReward : FragmentRewardBinding
    private val rewardFragment = RewardFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRewardSuccessBinding.inflate(layoutInflater)
        bindingReward = FragmentRewardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rewardSuccessButtonKlaimTicket.setOnClickListener {
            super.onBackPressed()
        }

        binding.rewardSuccessBackbutton.setOnClickListener {
            super.onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}