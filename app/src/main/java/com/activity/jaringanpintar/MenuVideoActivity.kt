package com.activity.jaringanpintar

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MenuVideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_video)

        // Tombol Back
        findViewById<ImageView>(R.id.btn_back_menu_video).setOnClickListener { finish() }

        // Tombol Video 1
        findViewById<CardView>(R.id.card_video_1).setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            intent.putExtra("ID_VIDEO", 1)
            startActivity(intent)
        }

        // Tombol Video 2
        findViewById<CardView>(R.id.card_video_2).setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            intent.putExtra("ID_VIDEO", 2)
            startActivity(intent)
        }

        // Tombol Video 3
        findViewById<CardView>(R.id.card_video_3).setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            intent.putExtra("ID_VIDEO", 3)
            startActivity(intent)
        }

        // Tombol Video 4
        findViewById<CardView>(R.id.card_video_4).setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            intent.putExtra("ID_VIDEO", 4)
            startActivity(intent)
        }

        // Tombol Video 5
        findViewById<CardView>(R.id.card_video_5).setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            intent.putExtra("ID_VIDEO", 5)
            startActivity(intent)
        }

        // Tombol Video 6
        findViewById<CardView>(R.id.card_video_6).setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            intent.putExtra("ID_VIDEO", 6)
            startActivity(intent)
        }

        // Tombol Video 7
        findViewById<CardView>(R.id.card_video_7).setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            intent.putExtra("ID_VIDEO", 7)
            startActivity(intent)
        }

        // Tombol Video 8
        findViewById<CardView>(R.id.card_video_8).setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            intent.putExtra("ID_VIDEO", 8)
            startActivity(intent)
        }
    }
}
