package com.example.alertapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ac2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac2)
        var v=findViewById<TextView>(R.id.tv)
        v.text=intent.getStringExtra("nn")
    }
}