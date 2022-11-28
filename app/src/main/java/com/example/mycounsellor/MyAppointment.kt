package com.example.mycounsellor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MyAppointment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_appointment)
        val button = findViewById<android.widget.ImageView>(R.id.back)
        button.isClickable = true
        button.setOnClickListener {
            val intent = Intent(this, PatientHomepage::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<android.widget.Button>(R.id.btnLogout)
        button2.setOnClickListener() {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }

}