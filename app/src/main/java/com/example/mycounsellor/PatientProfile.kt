package com.example.mycounsellor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.mycounsellor.databinding.ActivityPatientProfileBinding

class PatientProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_profile)

        val button = findViewById<Button>(R.id.logoutBtn)
        button.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<ImageView>(R.id.imageView4)
        button2.setOnClickListener {
            val intent = Intent(this, PatientHomepage::class.java)
            startActivity(intent)
        }
    }

}