package com.example.guiapractica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.guiapractica1.databinding.ActivityMainBinding
class WebviewActivity: AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var url= intent.getStringExtra("url").toString()

    }
}