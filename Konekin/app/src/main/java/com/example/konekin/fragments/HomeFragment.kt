package com.example.konekin.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.konekin.*
import com.example.konekin.databinding.FragmentFirstScreenBinding
import com.example.konekin.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.textViewTicketAmount.text = Variables.TICKET_AMOUNT.toString()
        binding.textViewPointAmount.text = Variables.POINT_AMOUNT.toString()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.layoutKonten1.setOnClickListener{
            val intent = Intent(activity, ContentActivity::class.java)
            startActivity(intent)
        }

        binding.textView15.setOnClickListener{
            val intent = Intent(activity, ContentActivity::class.java)
            startActivity(intent)
        }

        binding.layoutKonten2.setOnClickListener{
            val intent = Intent(activity, ContentActivity::class.java)
            startActivity(intent)
        }

        binding.textView20.setOnClickListener{
            val intent = Intent(activity, ContentActivity::class.java)
            startActivity(intent)
        }

        binding.textViewContentKreatorName1.setOnClickListener{
            val intent = Intent(activity, CreatorTimelineActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewKontenKreator1.setOnClickListener{
            val intent = Intent(activity, CreatorTimelineActivity::class.java)
            startActivity(intent)
        }

        binding.textViewContentKreatorName2.setOnClickListener{
            val intent = Intent(activity, CreatorTimelineActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewKontenKreator2.setOnClickListener{
            val intent = Intent(activity, CreatorTimelineActivity::class.java)
            startActivity(intent)
        }

        binding.textViewContentKreatorName3.setOnClickListener{
            val intent = Intent(activity, CreatorTimelineActivity::class.java)
            startActivity(intent)
        }

        binding.imageViewKontenKreator3.setOnClickListener{
            val intent = Intent(activity, CreatorTimelineActivity::class.java)
            startActivity(intent)
        }


    }

}