package com.example.konekin.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.konekin.LoginActivity
import com.example.konekin.R
import com.example.konekin.databinding.ActivityLoginBinding
import com.example.konekin.databinding.FragmentHomeBinding
import com.example.konekin.databinding.FragmentProfilBinding
import com.example.konekin.databinding.FragmentRewardBinding
import com.google.firebase.auth.FirebaseAuth

class ProfilFragment : Fragment() {

    private lateinit var binding : FragmentProfilBinding
    private lateinit var bindingLogin: ActivityLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfilBinding.inflate(layoutInflater)
        bindingLogin = ActivityLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.profileLogoutButton.setOnClickListener {
            FirebaseAuth.getInstance().signOut();
            val intent = Intent(activity, LoginActivity::class.java)
            startActivity(intent)
        }
    }

}