package com.example.konekin.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.konekin.ContentActivity
import com.example.konekin.R
import com.example.konekin.databinding.FragmentHistoryActivityBinding
import com.example.konekin.databinding.FragmentOngoingActivityBinding

class HistoryActivityFragment : Fragment() {
    private lateinit var binding : FragmentHistoryActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHistoryActivityBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.historyActivityTextViewContentTitle1.setOnClickListener {
            val intent = Intent(activity, ContentActivity::class.java)
            startActivity(intent)
        }
        binding.historyActivityImageViewContentCreator1.setOnClickListener {
            val intent = Intent(activity, ContentActivity::class.java)
            startActivity(intent)
        }

    }

}