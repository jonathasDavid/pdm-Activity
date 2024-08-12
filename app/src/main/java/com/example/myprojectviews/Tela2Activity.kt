package com.example.myprojectviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.core.content.ContextCompat

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val btnPrev: ImageButton = findViewById(R.id.btnPrev)
        val btnNext: ImageButton = findViewById(R.id.btnNext)

        btnPrev.setOnClickListener {
            // Volta para Tela1
            val intent = Intent(this, Tela1Activity::class.java)
            startActivity(intent)
        }

        btnNext.setOnClickListener {
            // Vai para Tela3
            val intent = Intent(this, Tela3Activity::class.java)
            startActivity(intent)
        }

        // Encontra o botão pelo ID

        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button8: Button = findViewById(R.id.button8)


        // Muda a cor do fundo do botão
        button2.backgroundTintList = ContextCompat.getColorStateList(this, R.color.colorTriadic1)
        button3.backgroundTintList = ContextCompat.getColorStateList(this, R.color.colorTriadic2)
        button8.backgroundTintList = ContextCompat.getColorStateList(this, R.color.colorTriadic3)



    }
}