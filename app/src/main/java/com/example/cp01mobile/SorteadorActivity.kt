package com.example.cp01mobile

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import kotlin.random.Random

class SorteadorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.sorteador)


        // Referências aos elementos da interface

        val inputNumeroInicial = findViewById<TextInputEditText>(R.id.inputNumeroInicial)
        val inputNumeroFinal = findViewById<TextInputEditText>(R.id.inputNumeroFinal)
        val btnSortear = findViewById<Button>(R.id.btnSortear)
        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)


        btnSortear.setOnClickListener {

            val min = inputNumeroInicial.text.toString().toIntOrNull()
            val max = inputNumeroFinal.text.toString().toIntOrNull()


            if (min != null && max != null && min <= max) {

                val numeroSorteado = Random.nextInt(min, max + 1)


                textViewResultado.text = numeroSorteado.toString()
            } else {

                textViewResultado.text = "Valores inválidos!"
            }
        }


        val btnVoltar = findViewById<Button>(R.id.bntVoltar)


        btnVoltar.setOnClickListener {
            finish()
        }



        }
    }