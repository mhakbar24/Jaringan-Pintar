package com.activity.jaringanpintar


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TujuanpembelajaranActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tujuanpembelajaran)

        val btnBack = findViewById<ImageView>(R.id.btn_back)
        btnBack.setOnClickListener {
            finish()
        }

        // 2. Mengambil wadah kosong dari XML
        val layoutDaftarTujuan = findViewById<LinearLayout>(R.id.layout_daftar_tujuan)

        // 3. Mengambil daftar teks (array) dari strings.xml
        val daftarTujuan = resources.getStringArray(R.array.tujuan_pembelajaran_list)

        // 4. Melakukan perulangan otomatis untuk membuat teks & nomor
        for (i in daftarTujuan.indices) {
            // Membuat baris horizontal baru
            val barisLayout = LinearLayout(this).apply {
                orientation = LinearLayout.HORIZONTAL
                setPadding(0, 0, 0, 24) // Jarak antar poin
            }

            // Membuat teks untuk Angka (1., 2., 3., dst)
            val tvAngka = TextView(this).apply {
                text = "${i + 1}."
                setTextColor(android.graphics.Color.parseColor("#1976D2")) // Warna Biru
                textSize = 14f
                setTypeface(null, android.graphics.Typeface.BOLD)
                layoutParams =
                    LinearLayout.LayoutParams(70, android.view.ViewGroup.LayoutParams.WRAP_CONTENT)
            }

            // Membuat teks untuk Isi Tujuan Pembelajaran
            val tvIsi = TextView(this).apply {
                text = daftarTujuan[i]
                setTextColor(android.graphics.Color.parseColor("#424242")) // Warna Abu-abu gelap
                textSize = 14f
                setLineSpacing(8f, 1f) // Jarak antar baris teks
                layoutParams = LinearLayout.LayoutParams(
                    0,
                    android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
                    1f
                )
            }

            // Masukkan Angka dan Isi ke dalam baris, lalu masukkan baris ke Wadah Utama
            barisLayout.addView(tvAngka)
            barisLayout.addView(tvIsi)
            layoutDaftarTujuan.addView(barisLayout)
        }
    }
}