package com.activity.jaringanpintar

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Tombol Kembali
        val btnBack = findViewById<ImageView>(R.id.btn_back_profile)
        btnBack.setOnClickListener {
            finish() // Menutup halaman profil dan kembali ke Home
        }
    }
}