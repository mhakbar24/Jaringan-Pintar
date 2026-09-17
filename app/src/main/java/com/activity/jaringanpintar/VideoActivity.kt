package com.activity.jaringanpintar

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class VideoActivity : AppCompatActivity() {
    private lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        // Tombol Back
        findViewById<ImageView>(R.id.btn_back_video).setOnClickListener { finish() }

        videoView = findViewById(R.id.videoView_local)
        val tvJudul = findViewById<TextView>(R.id.tv_judul_video)
        val tvDeskripsi = findViewById<TextView>(R.id.tv_deskripsi_video)

        // Setup MediaController untuk kontrol video (play, pause, dsb)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        // Ambil ID dari Intent
        val idVideo = intent.getIntExtra("ID_VIDEO", 1)
        
        val videoResId: Int
        val judulVideo: String
        val deskripsiVideo: String

        when (idVideo) {
            1 -> {
                videoResId = R.raw.fiber_optik
                judulVideo = getString(R.string.video_title_1)
                deskripsiVideo = getString(R.string.video_desc_1)
            }
            2 -> {
                videoResId = R.raw.simulasi_fiber_optik
                judulVideo = getString(R.string.video_title_2)
                deskripsiVideo = getString(R.string.video_desc_2)
            }
            3 -> {
                videoResId = R.raw.apa_itu_iot
                judulVideo = getString(R.string.video_title_3)
                deskripsiVideo = getString(R.string.video_desc_3)
            }
            4 -> {
                videoResId = R.raw.dasar_cloud
                judulVideo = getString(R.string.video_title_4)
                deskripsiVideo = getString(R.string.video_desc_4)
            }
            5 -> {
                videoResId = R.raw.seputar_data_center
                judulVideo = getString(R.string.video_title_5)
                deskripsiVideo = getString(R.string.video_desc_5)
            }
            6 -> {
                videoResId = R.raw.memahami_alamat_ip
                judulVideo = getString(R.string.video_title_6)
                deskripsiVideo = getString(R.string.video_desc_6)
            }
            7 -> {
                videoResId = R.raw.cara_microwave_link
                judulVideo = getString(R.string.video_title_7)
                deskripsiVideo = getString(R.string.video_desc_7)
            }
            8 -> {
                videoResId = R.raw.evolusi_jaringan
                judulVideo = getString(R.string.video_title_8)
                deskripsiVideo = getString(R.string.video_desc_8)
            }
            else -> {
                videoResId = R.raw.fiber_optik
                judulVideo = getString(R.string.video_title_1)
                deskripsiVideo = getString(R.string.video_desc_1)
            }
        }

        tvJudul.text = judulVideo
        tvDeskripsi.text = deskripsiVideo

        // Load dan Play Video Lokal
        val videoUri = Uri.parse("android.resource://" + packageName + "/" + videoResId)
        videoView.setVideoURI(videoUri)
        
        videoView.setOnPreparedListener { mp ->
            mp.isLooping = false
            videoView.start()
        }
    }

    override fun onPause() {
        super.onPause()
        if (videoView.isPlaying) {
            videoView.pause()
        }
    }

    override fun onResume() {
        super.onResume()
        videoView.resume()
    }
}
