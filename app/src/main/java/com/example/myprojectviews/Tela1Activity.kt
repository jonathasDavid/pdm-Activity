package com.example.myprojectviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import androidx.core.content.ContextCompat

class Tela1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela1)

        val btnNext: ImageButton = findViewById(R.id.btnNext)

        btnNext.setOnClickListener {
            // Log para depuração
            Log.d("Tela1Activity", "Botão 'Next' clicado")

            // Vai para Tela2
            val intent = Intent(this, Tela2Activity::class.java)
            startActivity(intent)
        }

        // Encontra os botões pelo ID
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)

        // Muda a cor do fundo dos botões
        button4.backgroundTintList = ContextCompat.getColorStateList(this, R.color.colorQuadratic1)
        button5.backgroundTintList = ContextCompat.getColorStateList(this, R.color.colorQuadratic2)
        button6.backgroundTintList = ContextCompat.getColorStateList(this, R.color.colorQuadratic3)
        button7.backgroundTintList = ContextCompat.getColorStateList(this, R.color.colorQuadratic4)
    }

}
