package com.example.implicitandexplicit

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.inplicitandexplicit.R

class ExplicitIntentHelper : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent_helper)

        val name: TextView = findViewById(R.id.name)
        name.text = intent.getStringExtra("Name").toString()
    }
}