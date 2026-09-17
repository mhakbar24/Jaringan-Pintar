package com.activity.jaringanpintar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView
import android.content.Intent
import androidx.constraintlayout.widget.ConstraintLayout


class MateriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_materi)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnBack = findViewById<ImageView>(R.id.btn_back_materi)
        btnBack.setOnClickListener {
            finish() // Menutup halaman Materi dan kembali ke Menu Utama
        }
        val cardMateri1 = findViewById<ConstraintLayout>(R.id.card_materi_1)
        cardMateri1.setOnClickListener {
            val intent = Intent(this, DetailMateriActivity::class.java)
            intent.putExtra("ID_MATERI", 1) // Mengirim angka 1
            startActivity(intent)
        }
        val cardMateri2 = findViewById<ConstraintLayout>(R.id.card_materi_2)
        cardMateri2.setOnClickListener {
            val intent = Intent(this, DetailMateriActivity::class.java)
            intent.putExtra("ID_MATERI", 2) // Mengirim angka 2
            startActivity(intent)
        }
        val cardMateri3 = findViewById<ConstraintLayout>(R.id.card_materi_3)
        cardMateri3.setOnClickListener {
            val intent = Intent(this, DetailMateriActivity::class.java)
            intent.putExtra("ID_MATERI", 3)
            startActivity(intent)
        }
        val cardMateri4 = findViewById<ConstraintLayout>(R.id.card_materi_4)
        cardMateri4.setOnClickListener {
            val intent = Intent(this, DetailMateriActivity::class.java)
            intent.putExtra("ID_MATERI", 4)
            startActivity(intent)
        }

        val cardMateri5 = findViewById<ConstraintLayout>(R.id.card_materi_5)
        cardMateri5.setOnClickListener {
            val intent = Intent(this, DetailMateriActivity::class.java)
            intent.putExtra("ID_MATERI", 5)
            startActivity(intent)
        }

        val cardMateri6 = findViewById<ConstraintLayout>(R.id.card_materi_6)
        cardMateri6.setOnClickListener {
            val intent = Intent(this, DetailMateriActivity::class.java)
            intent.putExtra("ID_MATERI", 6)
            startActivity(intent)
        }

        val cardMateri7 = findViewById<ConstraintLayout>(R.id.card_materi_7)
        cardMateri7.setOnClickListener {
            val intent = Intent(this, DetailMateriActivity::class.java)
            intent.putExtra("ID_MATERI", 7)
            startActivity(intent)
        }

        val cardMateri8 = findViewById<ConstraintLayout>(R.id.card_materi_8)
        cardMateri8.setOnClickListener {
            val intent = Intent(this, DetailMateriActivity::class.java)
            intent.putExtra("ID_MATERI", 8)
            startActivity(intent)
        }



    }
}