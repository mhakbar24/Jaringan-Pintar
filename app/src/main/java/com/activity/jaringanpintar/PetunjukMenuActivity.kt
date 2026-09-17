package com.activity.jaringanpintar

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView

import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class PetunjukMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_petunjuk_menu)

        val btnPengguna = findViewById<CardView>(R.id.btn_petunjuk_pengguna)
        val btnAplikasi = findViewById<CardView>(R.id.btn_cara_aplikasi)
        val btnDeskripsi = findViewById<CardView>(R.id.btn_deskripsi_produk)


        // Tombol 1: Petunjuk Pengguna
        btnPengguna.setOnClickListener {
            pindahKeDetail("PENGGUNA")
        }

        // Tombol 2: Cara Pakai Aplikasi
        btnAplikasi.setOnClickListener {
            pindahKeDetail("APLIKASI")
        }

        // Tombol 3: Deskripsi Produk
        btnDeskripsi.setOnClickListener {
            pindahKeDetail("DESKRIPSI")
        }

        val btnBack = findViewById<ImageView>(R.id.btn_back_petunjuk)
        btnBack.setOnClickListener {
            finish()
        }
    }

    // Fungsi bantuan agar tidak menulis kode Intent berulang kali
    private fun pindahKeDetail(tipe: String) {
        val intent = Intent(this, ActivityDetailPetunjuk::class.java)
        intent.putExtra("TIPE", tipe) // Mengirim "kunci" ke Activity tujuan
        startActivity(intent)
    }

}