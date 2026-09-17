package com.activity.jaringanpintar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.HtmlCompat


class DetailMateriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_materi)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnBack = findViewById<ImageView>(R.id.btn_back_detail)
        btnBack.setOnClickListener { finish() }

        // Menyiapkan Wadah dari XML
        val tvJudul = findViewById<TextView>(R.id.tv_judul_materi)
        val tvIsi = findViewById<TextView>(R.id.tv_isi_materi)
        val imgIlustrasi = findViewById<ImageView>(R.id.img_ilustrasi_materi)

        // Menangkap "Pesan" dari halaman sebelumnya
        val idMateri = intent.getIntExtra("ID_MATERI", 1) // Defaultnya 1

        // Logika IF untuk mengubah isi secara dinamis
        if (idMateri == 1) {
            tvJudul.text = getString(R.string.title_materi_1)
            // Ini kode sakti untuk merender HTML di TextView
            val teksHtml = getString(R.string.isi_materi_1)

            tvIsi.text = HtmlCompat.fromHtml(teksHtml, HtmlCompat.FROM_HTML_MODE_LEGACY)
            imgIlustrasi.setImageResource(R.drawable.sejarah)
        }
        else if (idMateri == 2) {
            tvJudul.text = getString(R.string.title_materi_2)
            val teksHtml = getString(R.string.isi_materi_2)
            tvIsi.text = HtmlCompat.fromHtml(teksHtml, HtmlCompat.FROM_HTML_MODE_LEGACY)
            imgIlustrasi.setImageResource(R.drawable.karakter)
        }
        else if (idMateri == 3) {
            tvJudul.text = getString(R.string.title_materi_3)
            val teksHtml = getString(R.string.isi_materi_3)
            tvIsi.text = HtmlCompat.fromHtml(teksHtml, HtmlCompat.FROM_HTML_MODE_LEGACY)
            imgIlustrasi.setImageResource(R.drawable.struktur)
        }
        else if (idMateri == 4) {
            tvJudul.text = getString(R.string.title_materi_4)
            val teksHtml = getString(R.string.isi_materi_4)
            tvIsi.text = HtmlCompat.fromHtml(teksHtml, HtmlCompat.FROM_HTML_MODE_LEGACY)
            imgIlustrasi.setImageResource(R.drawable.fos)
        }
        else if (idMateri == 5) {
            tvJudul.text = getString(R.string.title_materi_5)
            val teksHtml = getString(R.string.isi_materi_5)
            tvIsi.text = HtmlCompat.fromHtml(teksHtml, HtmlCompat.FROM_HTML_MODE_LEGACY)
            imgIlustrasi.setImageResource(R.drawable.iot)
        }
        else if (idMateri == 6) {
            tvJudul.text = getString(R.string.title_materi_6)
            val teksHtml = getString(R.string.isi_materi_6)
            tvIsi.text = HtmlCompat.fromHtml(teksHtml, HtmlCompat.FROM_HTML_MODE_LEGACY)
            imgIlustrasi.setImageResource(R.drawable.center)
        }
        else if (idMateri == 7) {
            tvJudul.text = getString(R.string.title_materi_7)
            val teksHtml = getString(R.string.isi_materi_7)
            tvIsi.text = HtmlCompat.fromHtml(teksHtml, HtmlCompat.FROM_HTML_MODE_LEGACY)
            imgIlustrasi.setImageResource(R.drawable.cloudcomputing)
        }
        else if (idMateri == 8) {
            tvJudul.text = getString(R.string.title_materi_8)
            val teksHtml = getString(R.string.isi_materi_8)
            tvIsi.text = HtmlCompat.fromHtml(teksHtml, HtmlCompat.FROM_HTML_MODE_LEGACY)
            imgIlustrasi.setImageResource(R.drawable.cs)
        }
    }
}