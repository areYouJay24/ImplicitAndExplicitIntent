package com.example.implicitandexplicit

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.inplicitandexplicit.R

class ImplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)

        val demoTitle: String? = intent.getStringExtra("name_i")
        demoTitle?.let {
            val name: TextView = findViewById(R.id.demo_title)
            name.text = demoTitle
        }

        val btnEnterUrl: Button = findViewById(R.id.btn_enterName)

        btnEnterUrl.setOnClickListener {

            val enterUrl: EditText = findViewById(R.id.enterName)
            val intent = Intent().apply {
                action = Intent.ACTION_VIEW
                data = Uri.parse(enterUrl.text.toString())
            }

            try {
                startActivity(intent)
            }catch (e: ActivityNotFoundException){
                Toast.makeText(this, "No activity found to handle ths intent", Toast.LENGTH_LONG).show()
            }
        }


    }
}