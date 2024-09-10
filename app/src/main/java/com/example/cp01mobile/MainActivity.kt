package com.example.cp01mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val btnIrParaOSorteador = findViewById<Button>(R.id.btnIrParaOSorteador)


        btnIrParaOSorteador.setOnClickListener {
            val intent = Intent(this, SorteadorActivity::class.java)
            startActivity(intent)
        }

        val btnIrParaIntegrantes = findViewById<Button>(R.id.btnIrParaIntegrantes)
        btnIrParaIntegrantes.setOnClickListener {
            val intent = Intent(this, IntegrantesActivity::class.java)
            startActivity(intent)
        }


    }
}