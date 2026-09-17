package com.activity.jaringanpintar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import androidx.constraintlayout.widget.ConstraintLayout
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainmenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mainmenu)

       val home = findViewById<ConstraintLayout>(R.id.card_home)
        home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK }
            startActivity(intent)
            finish()}
        val tujuan = findViewById<View>(R.id.card_tujuan)
        tujuan.setOnClickListener {
            startActivity(Intent(this@MainmenuActivity, TujuanpembelajaranActivity::class.java))
        }
        val materi = findViewById<View>(R.id.card_materi)
        materi.setOnClickListener {
            startActivity(Intent(this@MainmenuActivity, MateriActivity::class.java))
        }
        val video = findViewById<View>(R.id.card_video)
        video.setOnClickListener {
            startActivity(Intent(this@MainmenuActivity, MenuVideoActivity::class.java))
        }
        val quiz = findViewById<View>(R.id.card_quiz)
        quiz.setOnClickListener {
            startActivity(Intent(this@MainmenuActivity, QuizActivity::class.java))
        }
        val profil = findViewById<View>(R.id.card_profil)
        profil.setOnClickListener {
            startActivity(Intent(this@MainmenuActivity, ProfileActivity::class.java))
        }
        val petunjuk = findViewById<View>(R.id.card_petunjuk)
        petunjuk.setOnClickListener {
            startActivity(Intent(this@MainmenuActivity, PetunjukMenuActivity::class.java))
        }

    }


}