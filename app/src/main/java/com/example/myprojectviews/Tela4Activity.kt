package com.example.myprojectviews


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Tela4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela4)

        val btnPrev: ImageButton = findViewById(R.id.btnPrev)
        val btnNext: ImageButton = findViewById(R.id.btnNext)

        btnPrev.setOnClickListener {
            // Volta para Tela3
            val intent = Intent(this, Tela3Activity::class.java)
            startActivity(intent)
        }

        btnNext.setOnClickListener {
            // Vai para Tela1
            val intent = Intent(this, Tela1Activity::class.java)
            startActivity(intent)
        }
    }
}