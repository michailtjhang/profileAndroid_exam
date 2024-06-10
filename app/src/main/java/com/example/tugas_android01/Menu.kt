package com.example.tugas_android01

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val showProfile: ImageView = findViewById(R.id.profile)
        showProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val showLanguage: ImageView = findViewById(R.id.language)
        showLanguage.setOnClickListener {
            val intent = Intent(this, language::class.java)
            startActivity(intent)
        }

        val showFile: ImageView = findViewById(R.id.file)
        showFile.setOnClickListener {
            val intent = Intent(this, file::class.java)
            startActivity(intent)
        }

        val showContact: ImageView = findViewById(R.id.contact)
        showContact.setOnClickListener {
            val intent = Intent(this, contact::class.java)
            startActivity(intent)
        }
    }
}