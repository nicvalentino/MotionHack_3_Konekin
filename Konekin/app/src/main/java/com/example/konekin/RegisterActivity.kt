package com.example.konekin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.konekin.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRegisterBinding
    private lateinit var firebaseAuth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.registerButton.setOnClickListener{
            val email = binding.registerEmail.text.toString()
            val password = binding.registerPassword.text.toString()
            val konfirmasiPassword = binding.registerKonfirmasiPassword.text.toString()

            if(email.isNotEmpty() && password.isNotEmpty() && konfirmasiPassword.isNotEmpty()){
                if(password == konfirmasiPassword){
                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener{
                        if(it.isSuccessful){
                            val intent = Intent(this, LoginActivity::class.java)
                            startActivity(intent)
                        } else{
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                } else{
                    Toast.makeText(this, "Password yang dimasukkan tidak sama!", Toast.LENGTH_SHORT).show()
                }
            } else{
                Toast.makeText(this, "Kolom inputan tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.textViewRedirectLogin.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}