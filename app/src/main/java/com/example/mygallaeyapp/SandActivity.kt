package com.example.mygallaeyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SandActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sand)
        var name=findViewById<TextView>(R.id.tvname5)
        var btnButton=findViewById<Button>(R.id.btnbutton5)
        btnButton.setOnClickListener {
            var intent= Intent(baseContext,SandActivity::class.java)
            startActivity(intent)


        }
}
}