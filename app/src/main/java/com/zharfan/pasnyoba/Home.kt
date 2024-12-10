package com.zharfan.pasnyoba

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.Profile
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonStart = findViewById<LinearLayout>(R.id.r7ygsmxu3q6d)
        buttonStart.setOnClickListener { // Berpindah ke Login Screen
            val intent: Intent =
                Intent(
                    this@Home,
                    Belikopi::class.java
                )
            startActivity(intent)
            finish()
        }
        val buttonProfile = findViewById<ImageView>(R.id.ImageView2)
        buttonProfile.setOnClickListener { // Berpindah ke Login Screen
            val intent: Intent =
                Intent(
                    this@Home,
                    Account::class.java
                )
            startActivity(intent)
            finish()
        }

    }
}