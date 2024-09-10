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

        // Evento de clique no botão "Sortear"
        btnSortear.setOnClickListener {
            // Captura dos números inseridos pelo usuário
            val min = inputNumeroInicial.text.toString().toIntOrNull()
            val max = inputNumeroFinal.text.toString().toIntOrNull()

            // Verifica se os valores são válidos
            if (min != null && max != null && min <= max) {
                // Sorteia um número aleatório entre o intervalo dado
                val numeroSorteado = Random.nextInt(min, max + 1)

                // Exibe o número sorteado no TextView
                textViewResultado.text = numeroSorteado.toString()
            } else {
                // Exibe uma mensagem de erro se os valores forem inválidos
                textViewResultado.text = "Valores inválidos!"
            }
        }

        // Referência ao botão "Voltar"
        val btnVoltar = findViewById<Button>(R.id.bntVoltar)

        // Configura o clique no botão para voltar à MainActivity
        btnVoltar.setOnClickListener {
            finish()  // Encerra a SorteadorActivity e volta para a MainActivity
        }



        }
    }