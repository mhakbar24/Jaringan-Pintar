package com.activity.jaringanpintar
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityDetailPetunjuk : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_petunjuk)

        val btnBack = findViewById<ImageView>(R.id.btn_back_detail)
        val tvHeader = findViewById<TextView>(R.id.tv_header_title)
        val tvTitleContent = findViewById<TextView>(R.id.tv_detail_title)
        val tvContent = findViewById<TextView>(R.id.tv_detail_content)
        val containerImages = findViewById<LinearLayout>(R.id.container_images)
        val ivStep1 = findViewById<ImageView>(R.id.iv_step1)
        val ivStep2 = findViewById<ImageView>(R.id.iv_step2)

        // Ambil tipe dari intent
        val tipe = intent.getStringExtra("TIPE")

        // Inisialisasi visibilitas gambar
        containerImages.visibility = View.GONE

        // Logika pengisian konten statis
        when (tipe) {
            "PENGGUNA" -> {
                tvHeader.text = "PENGGUNA"
                tvTitleContent.text = "Panduan Penggunaan Aplikasi"
                tvContent.text = """

                """.trimIndent()
                containerImages.visibility = View.VISIBLE
                ivStep1.setImageResource(R.drawable.image_1)
                ivStep2.setImageResource(R.drawable.image_2)
            }
            "APLIKASI" -> {
                tvHeader.text = "APLIKASI"
                tvTitleContent.text = "Langkah Penggunaan Media"
                tvContent.text = """
        Ikuti panduan berikut untuk menggunakan media pembelajaran Jaringan Pintar:
        
        1. Halaman Awal (Landing Page)
        Saat pertama kali membuka aplikasi, Anda akan melihat halaman selamat datang. Tekan tombol "START" yang berwarna ungu untuk masuk ke dalam Menu Utama.
        
        2. Navigasi Menu Utama
        Setelah menekan Start, Anda akan diarahkan ke Dashboard yang berisi berbagai fitur:
        • Home 
          Untuk kembali ke halaman paling awal.
        • Tujuan Pembelajaran
          Memahami kompetensi yang harus dicapai.
        • Materi
          Berisi modul teks dasar teknik jaringan.
        • Video
          Visualisasi praktik jaringan secara langsung.
        • Quiz
          Uji pemahaman Anda setelah belajar.
        
        3. Cara Belajar yang Efektif
        Disarankan untuk membaca 'Tujuan' terlebih dahulu, kemudian pelajari 'Materi', tonton 'Video', dan diakhiri dengan mengerjakan 'Quiz'.
    """.trimIndent()

                // Tampilkan gambar untuk kategori ini
                //containerImages.visibility = View.VISIBLE

                // Muat gambar secara langsung dari drawable (gunakan ID drawable Anda)
                // ivStep1.setImageResource(R.drawable.welcome_screen_image) // Ganti welcome_screen_image dengan nama file image_2 Anda di drawable
                // ivStep2.setImageResource(R.drawable.menu_structure_image)    // Ganti menu_structure_image dengan nama file image_1 Anda di drawable
            }
            "DESKRIPSI" -> {
                tvHeader.text = "PRODUK"
                tvTitleContent.text = "Deskripsi Aplikasi"
                tvContent.text = """
        Aplikasi "Jaringan Pintar" adalah media pembelajaran interaktif berbasis Android yang dirancang khusus untuk mendukung proses belajar mengajar pada mata pelajaran Teknik Jaringan Komputer dan Telekomunikasi (TJKT).
        
        Fitur Utama:
        • Pembelajaran Komprehensif: Menyediakan materi mulai dari dasar-dasar jaringan hingga teknologi serat optik terkini.
        • Konten Multimedia: Dilengkapi dengan video pembelajaran simulasi untuk memudahkan pemahaman konsep abstrak.
        • Evaluasi Interaktif: Fitur Quiz untuk menguji sejauh mana pemahaman pengguna terhadap materi yang telah dipelajari.
        • Antarmuka Modern: Desain "Vibrant Aura" dengan prinsip Glassmorphism yang memberikan pengalaman pengguna yang menyenangkan dan modern.
        
        Aplikasi ini dikembangkan untuk membantu peserta didik mencapai Capaian Pembelajaran (CP) fase E terkait perkembangan teknologi jaringan dan telekomunikasi secara mandiri dan fleksibel.
        
        Dukungan Sistem Operasi:
        Aplikasi ini dapat berjalan di semua versi perangkat Android.
        
        Dukungan Hardware:
        Dapat berjalan pada berbagai spesifikasi perangkat Android (Smartphone/Tablet) dengan performa optimal pada perangkat yang mendukung pemutaran video berkualitas HD.
        
        Spesifikasi Perangkat Minimal:
        • RAM: 2 GB atau lebih tinggi.
        • Penyimpanan: Minimal 100 MB ruang kosong.
        • Prosesor: Quad-core 1.2 GHz atau lebih tinggi.
    """.trimIndent()
            }
        }

        // Fungsi tombol back
        btnBack.setOnClickListener {
            finish() // Menutup activity dan kembali ke menu petunjuk
        }
    }
}