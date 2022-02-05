package com.example.fintecha75

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val clientButton = findViewById<ImageButton>(R.id.ivStartActivityPersonButton)
        val marketButton = findViewById<ImageButton>(R.id.ivStartActivityMarketButton)

        clientButton.setOnClickListener {
            val intent = Intent(this@StartActivity, LoginActivityClient::class.java)
            startActivity(intent)
        }

        marketButton.setOnClickListener {
            val intent = Intent(this@StartActivity, LoginActivityMarket::class.java)
            startActivity(intent)
        }


    }

}