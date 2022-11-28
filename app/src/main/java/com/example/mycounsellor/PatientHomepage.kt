package com.example.mycounsellor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout

class PatientHomepage : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_homepage)
         val button = findViewById<LinearLayout>(R.id.book_appointments)
            button.isClickable = true
            button.setOnClickListener {
                val intent = Intent(this, BookAppointment::class.java)
                startActivity(intent)
            }
        val button2 = findViewById<LinearLayout>(R.id.my_profile)
        button2.isClickable = true
        button2.setOnClickListener {
            val intent = Intent(this, PatientProfile::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<LinearLayout>(R.id.my_appointments)
        button3.isClickable = true
        button3.setOnClickListener {
            val intent = Intent(this, MyAppointment::class.java)
            startActivity(intent)
        }
        val button4 = findViewById<LinearLayout>(R.id.reviews)
        button4.isClickable = true
        button4.setOnClickListener {
            val intent = Intent(this, Reviews::class.java)
            startActivity(intent)
        }

    }


}
