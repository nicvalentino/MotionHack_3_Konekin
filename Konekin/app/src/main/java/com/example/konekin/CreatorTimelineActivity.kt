package com.example.konekin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.konekin.databinding.ActivityContentBinding
import com.example.konekin.databinding.ActivityCreatorTimelineBinding

class CreatorTimelineActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCreatorTimelineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreatorTimelineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.creatorBackButton.setOnClickListener {
            super.onBackPressed()
        }
    }

}