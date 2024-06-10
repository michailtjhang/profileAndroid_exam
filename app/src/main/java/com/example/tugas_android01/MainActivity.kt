package com.example.tugas_android01

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var usernameInput : EditText
    private lateinit var passwordInput : EditText
    private lateinit var loginBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            Log.i("Test Credentials", "Username : $username and password : $password")

            if (isLoginValid(username, password)) {
                // Navigate to Main Page
                val intent = Intent(this, Menu::class.java)
                startActivity(intent)
                finish() // Close the current activity
            } else {
                // Show error message
                Toast.makeText(this, "Login failed. Please check your credentials.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isLoginValid(username: String, password: String): Boolean {
        // Replace with your actual login logic
        return username == "admin" && password == "admin123"
    }
}