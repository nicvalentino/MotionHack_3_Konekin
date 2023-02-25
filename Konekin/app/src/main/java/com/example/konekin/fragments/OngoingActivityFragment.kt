package com.example.konekin.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.konekin.ContentActivity
import com.example.konekin.R
import com.example.konekin.databinding.FragmentHomeBinding
import com.example.konekin.databinding.FragmentOngoingActivityBinding

class OngoingActivityFragment : Fragment() {
    private lateinit var binding : FragmentOngoingActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOngoingActivityBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ongoingActivityTextViewContentTitle1.setOnClickListener {
            val intent = Intent(activity, ContentActivity::class.java)
            startActivity(intent)
        }
        binding.ongoingActivityImageViewContentCreator1.setOnClickListener {
            val intent = Intent(activity, ContentActivity::class.java)
            startActivity(intent)
        }

        binding.ongoingActivityTextViewContentTitle2.setOnClickListener {
            val intent = Intent(activity, ContentActivity::class.java)
            startActivity(intent)
        }
        binding.ongoingActivityImageViewContentCreator2.setOnClickListener {
            val intent = Intent(activity, ContentActivity::class.java)
            startActivity(intent)
        }
    }
}