package com.example.konekin.onboarding.screens

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.konekin.DashboardActivity
import com.example.konekin.LoginActivity
import com.example.konekin.R
import com.example.konekin.RegisterActivity
import com.example.konekin.databinding.FragmentSecondScreenBinding
import com.example.konekin.databinding.FragmentThirdScreenBinding

class ThirdScreen : Fragment() {
    private lateinit var binding : FragmentThirdScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThirdScreenBinding.inflate(inflater, container, false)
//        val view = inflater.inflate(R.layout.fragment_first_screen, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.buttonLoginCreator.setOnClickListener{
            val intent = Intent(activity, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.buttonLoginAudience.setOnClickListener{
            val intent = Intent(activity, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.textViewRedirectRegister.setOnClickListener{
            val intent = Intent(activity, RegisterActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }

}