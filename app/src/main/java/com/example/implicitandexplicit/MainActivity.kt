package com.example.implicitandexplicit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.inplicitandexplicit.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnImplicitIntent: Button = findViewById(R.id.btn_ii)
        val btnExplicitIntent: Button = findViewById(R.id.btn_ei)

        btnImplicitIntent.setOnClickListener {
           val intent = Intent(this, ImplicitIntent::class.java).apply {
               putExtra("name_i", "Implicit Intent")
           }
            startActivity(intent)
        }


        btnExplicitIntent.setOnClickListener {
            val intent = Intent(this, ExplicitIntent::class.java).apply {
                putExtra("name_e", "Explicit Intent")
            }
            startActivity(intent)
        }

    }
}