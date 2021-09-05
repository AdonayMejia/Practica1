package com.example.guiapractica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.google.android.material.snackbar.Snackbar
import com.example.guiapractica1.databinding.ActivityMainBinding
import com.example.guiapractica1.databinding.FormularioBinding

class MainActivity : AppCompatActivity() {


    val sheratonUrl = "https://turismo.org/hoteles-en-egipto/"

    lateinit var binding: ActivityMainBinding
    lateinit var view: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addListener()
    }

    private fun addListener() {
        val key = "url"
        binding.apply {
            btnsheraton.setOnClickListener {
                startActivity(Intent(this@MainActivity , Hotel ::class.java))
            }
        btnForm.setOnClickListener{
           startActivity(Intent(this@MainActivity,FormularioBinding ::class.java))
        }


        }
    }

}