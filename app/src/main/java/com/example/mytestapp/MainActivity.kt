package com.example.mytestapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mytestapp.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun clickButton(view: View){
        binding.layout.setBackgroundColor(Color.rgb((0..255).random(), (0..255).random(), (0..255).random()));
    }

    fun clickImage(view: View){
        binding.image.setBackgroundColor(Color.rgb((0..255).random(), (0..255).random(), (0..255).random()));
    }
}