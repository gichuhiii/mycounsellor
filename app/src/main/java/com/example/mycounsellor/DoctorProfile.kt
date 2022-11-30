package com.example.mycounsellor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class DoctorProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_profile)
        val button = findViewById<Button>(R.id.logoutBtn)
        button.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<ImageView>(R.id.imageView4)
        button2.setOnClickListener {
            val intent = Intent(this, DoctorHomepage::class.java)
            startActivity(intent)
        }
    }

}