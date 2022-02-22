package com.example.fintecha75

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivityMarket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_market)

        val buttonSingUpMarket: Button = findViewById<Button>(R.id.bLoginActivityMarketSingUp)
        buttonSingUpMarket.isEnabled = true
        buttonSingUpMarket.setOnClickListener {
            goToSignUpMarket()
        }
    }

    private fun goToSignUpMarket() {
        intent = Intent(this@LoginActivityMarket, SingUpActivityMarket::class.java)
        startActivity(intent)
    }
}