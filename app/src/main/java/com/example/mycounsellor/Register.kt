package com.example.mycounsellor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val signupbutton = findViewById<Button>(R.id.signupbtn)
        signupbutton.setOnClickListener{
            val Intent = Intent(this,Patient_homepage::class.java)
            startActivity(Intent())
        }
        val loginbutton = findViewById<Button>(R.id.loginbtn)
        signupbutton.setOnClickListener{
            val Intent = Intent(this,Login::class.java)
            startActivity(Intent())
        }
    }
}