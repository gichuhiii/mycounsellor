package com.example.mycounsellor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signupbutton = findViewById<Button>(R.id.signupbtn)
        signupbutton.setOnClickListener{
            val Intent = Intent(this,Register::class.java)
        startActivity(Intent())
        }
        val loginbutton = findViewById<Button>(R.id.loginbtn)
        signupbutton.setOnClickListener{
            val Intent = Intent(this,Patient_homepage::class.java)
            startActivity(Intent())
        }
    }
}