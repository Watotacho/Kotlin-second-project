package com.example.mygallaeyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class EnvironmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_environment)
        var name=findViewById<TextView>(R.id.tvname2)
        var btnButton=findViewById<Button>(R.id.btnbutton2)
        btnButton.setOnClickListener {
            var intent= Intent(baseContext,AnimalActivity::class.java)
            startActivity(intent)
        }
    }
}