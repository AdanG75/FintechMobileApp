package com.example.fintecha75

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivityClient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_client)

        val signUpButton: Button = findViewById<Button>(R.id.bLoginActivityClientSingUp)
        signUpButton.isEnabled = true
        signUpButton.setOnClickListener {
            goToSingUpActivity()
        }
    }

    private fun goToSingUpActivity() {
        val intent = Intent(this@LoginActivityClient, SingUpActivityClient::class.java)
        startActivity(intent)
    }
}