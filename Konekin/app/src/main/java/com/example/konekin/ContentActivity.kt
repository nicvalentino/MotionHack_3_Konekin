package com.example.konekin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.konekin.Variables.Companion.TICKET_AMOUNT
import com.example.konekin.databinding.ActivityContentBinding
import com.example.konekin.fragments.RewardFragment

class ContentActivity : AppCompatActivity() {
    private lateinit var binding : ActivityContentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            TICKET_AMOUNT -= 2
            val intent = Intent(this, SuccessTransactionActivity::class.java)
            startActivity(intent)
        }

        binding.textViewContentKreatorName.setOnClickListener{
            val intent = Intent(this, CreatorTimelineActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewKontenKreator.setOnClickListener{
            val intent = Intent(this, CreatorTimelineActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}