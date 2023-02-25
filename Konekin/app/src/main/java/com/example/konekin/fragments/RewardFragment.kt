

package com.example.konekin.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.konekin.R
import com.example.konekin.RewardSuccessActivity
import com.example.konekin.Variables.Companion.POINT_AMOUNT
import com.example.konekin.Variables.Companion.TICKET_AMOUNT
import com.example.konekin.databinding.ActivityRewardBinding
import com.example.konekin.databinding.FragmentHomeBinding
import com.example.konekin.databinding.FragmentRewardBinding

class RewardFragment : Fragment() {

    private lateinit var binding: FragmentRewardBinding
    private lateinit var bindingHome: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentRewardBinding.inflate(layoutInflater)
        binding.rewardTextViewTicketAmount.text = TICKET_AMOUNT.toString()
        binding.rewardTextViewPointAmount.text = POINT_AMOUNT.toString()
        bindingHome = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        binding.rewardButtonTukarPoin.setOnClickListener {
            activity?.let{
                TICKET_AMOUNT += 1
                POINT_AMOUNT -= 1000
                binding.rewardTextViewTicketAmount.text = TICKET_AMOUNT.toString()
                binding.rewardTextViewPointAmount.text = POINT_AMOUNT.toString()
                val intent = Intent(it, RewardSuccessActivity::class.java)
                it.startActivity(intent)
            }
        }

    }



}