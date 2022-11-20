package com.example.mycounsellor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_patient_homepage.*

class Patient_homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_homepage)
        viewAppointment.isClickable = true
        viewAppointment.setOnClickListener {
            val intent = Intent(this, MyAppointment::class.java)
            startActivity(intent)
        }
    }
}