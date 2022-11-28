package com.example.mycounsellor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_doctor_homepage.*

class DoctorHomepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_homepage)
        my_profile.isClickable = true
        my_profile.setOnClickListener {
            val intent = Intent(this, DoctorProfile::class.java)
            startActivity(intent)
        }


    }
}
