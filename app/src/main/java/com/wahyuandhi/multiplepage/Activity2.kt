package com.wahyuandhi.multiplepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahyuandhi.multiplepage.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {

    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvName.text = intent.getStringExtra("Name")
        binding.tvAddress.text = intent.getStringExtra("Address")
        binding.tvContact.text = intent.getStringExtra("Contact")
    }
}