package com.example.myprojectviews


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.core.content.ContextCompat

class Tela3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val btnPrev: ImageButton = findViewById(R.id.btnPrev)
        val btnNext: ImageButton = findViewById(R.id.btnNext)

        btnPrev.setOnClickListener {
            // Volta para Tela2
            val intent = Intent(this, Tela2Activity::class.java)
            startActivity(intent)
        }

        btnNext.setOnClickListener {
            // Vai para Tela4
            val intent = Intent(this, Tela4Activity::class.java)
            startActivity(intent)
        }

        // Encontra o botão pelo ID

        val button10: Button = findViewById(R.id.button10)
        val button12: Button = findViewById(R.id.button12)
        val button9: Button = findViewById(R.id.button9)


        // Muda a cor do fundo do botão
        button10.backgroundTintList = ContextCompat.getColorStateList(this, R.color.colorMonochromatic1)
        button12.backgroundTintList = ContextCompat.getColorStateList(this, R.color.colorMonochromatic2)
        button9.backgroundTintList = ContextCompat.getColorStateList(this, R.color.colorMonochromatic3)



    }
}