package com.example.mycounsellor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Reviews : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviews)
        val button = findViewById<android.widget.ImageView>(R.id.back)
        button.isClickable = true
        button.setOnClickListener {
            val intent = Intent(this, PatientHomepage::class.java)
            startActivity(intent)
        }

    }
}