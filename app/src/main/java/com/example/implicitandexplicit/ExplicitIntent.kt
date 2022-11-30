package com.example.implicitandexplicit

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.inplicitandexplicit.R

class ExplicitIntent : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)


        val demoTitle: String? = intent.getStringExtra("name_e")
        demoTitle?.let {
            val name: TextView = findViewById(R.id.demo_title)
            name.text = demoTitle
        }

        val btn_enterName: Button = findViewById(R.id.btn_enterName)

        btn_enterName.setOnClickListener {
            val enterName: EditText = findViewById(R.id.enterName)
            val intent = Intent(this, ExplicitIntentHelper::class.java).apply {
                putExtra("Name", enterName.text.toString())
            }
            startActivity(intent)

        }
    }
}