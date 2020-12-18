package com.wahyuandhi.multiplepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.wahyuandhi.multiplepage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun save(view: View) {
        val intent = Intent(this, Activity2::class.java).apply {
            putExtra("Name", binding.etName.text.toString())
            putExtra("Address", binding.etAddress.text.toString())
            putExtra("Contact", binding.etContact.text.toString())
        }

        startActivity(intent)
    }
}