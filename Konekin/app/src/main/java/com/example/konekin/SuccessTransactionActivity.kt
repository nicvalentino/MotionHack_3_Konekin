package com.example.konekin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.konekin.databinding.ActivityContentBinding
import com.example.konekin.databinding.ActivitySuccessTransactionBinding
import com.example.konekin.fragments.HomeFragment

class SuccessTransactionActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySuccessTransactionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuccessTransactionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView15.setOnClickListener{
            onBackPressed()
        }

        binding.button2.setOnClickListener{
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}