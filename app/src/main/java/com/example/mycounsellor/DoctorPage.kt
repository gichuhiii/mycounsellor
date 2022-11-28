package com.example.mycounsellor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DoctorPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_page)

//        val button = findViewById<Button>(R.id.btnBook2)
//        button.setOnClickListener {
//            val intent = Intent(this, BookAppointment::class.java)
//            startActivity(intent)
//        }
        val button = findViewById<ImageView>(R.id.imageView10)
        button.isClickable = true
        button.setOnClickListener {
            val intent = Intent(this, DoctorHomepage::class.java)
            startActivity(intent)
        }

    }
}