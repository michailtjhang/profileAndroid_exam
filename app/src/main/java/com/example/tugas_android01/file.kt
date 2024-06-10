package com.example.tugas_android01

import android.os.Bundle
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity

class file : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file)
        supportActionBar?.title = "File"

        val backButton: Button = findViewById(R.id.back)
        backButton.setOnClickListener {
            finish()
        }
    }
}