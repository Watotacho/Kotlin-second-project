package com.example.mygallaeyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ChalbiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chalbi)
        var name=findViewById<TextView>(R.id.tvname4)
        var btnButton=findViewById<Button>(R.id.btnbutton4)
        btnButton.setOnClickListener {
            var intent= Intent(baseContext,ChalbiActivity::class.java)
            startActivity(intent)

    }
}
}