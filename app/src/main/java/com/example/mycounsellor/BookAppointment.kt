package com.example.mycounsellor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class BookAppointment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_appointment)
        val button = findViewById<Button>(R.id.button6)
        button.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button7)
        button2.setOnClickListener {
            val intent = Intent(this, MyAppointment::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<ImageView>(R.id.imageView)
        button3.setOnClickListener {
            val intent = Intent(this, PatientHomepage::class.java)
            startActivity(intent)
        }

    }
}