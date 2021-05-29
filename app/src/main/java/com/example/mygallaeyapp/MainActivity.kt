package com.example.mygallaeyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name=findViewById<TextView>(R.id.tvname1)
        var btnButton=findViewById<Button>(R.id.btnbutton1)
        btnButton.setOnClickListener {
            var intent=Intent(baseContext,EnvironmentActivity::class.java)
            startActivity(intent)
        }
    }
}