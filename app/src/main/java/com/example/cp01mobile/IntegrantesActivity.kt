package com.example.cp01mobile

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IntegrantesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.integrantes)

        // Referência ao botão "Voltar"
        val btnVoltar = findViewById<Button>(R.id.bntVoltar2)

        // Configura o clique no botão para voltar à MainActivity
        btnVoltar.setOnClickListener {
            finish()  // Encerra a SorteadorActivity e volta para a MainActivity
        }

    }
}