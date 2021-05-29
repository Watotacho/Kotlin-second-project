package com.example.mygallaeyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AnimalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)
        var name=findViewById<TextView>(R.id.tvname3)
        var btnButton=findViewById<Button>(R.id.btnbutton3)
        btnButton.setOnClickListener {
            var intent= Intent(baseContext,ChalbiActivity::class.java)
            startActivity(intent)

    }
}
}