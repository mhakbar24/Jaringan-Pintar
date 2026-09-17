package com.activity.jaringanpintar
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val btnBack = findViewById<ImageView>(R.id.btn_back_kuis)
        val webView = findViewById<WebView>(R.id.webView_wordwall)

        // 1. Setting WebView agar Wordwall Lancar
        val settings = webView.settings
        settings.javaScriptEnabled = true
        settings.domStorageEnabled = true
        settings.useWideViewPort = true
        settings.loadWithOverviewMode = true

        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()

        // 2. TOMBOL BACK
        btnBack.setOnClickListener { finish() }

        val cardWebView = findViewById<androidx.cardview.widget.CardView>(R.id.card_webview)
        ViewCompat.setOnApplyWindowInsetsListener(cardWebView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())

            // Kita ubah margin bawah agar pas di atas tombol navigasi
            val params = v.layoutParams as ConstraintLayout.LayoutParams
            params.bottomMargin = systemBars.bottom - 30 // Mengurangi offset negatif di XML
            v.layoutParams = params

            insets
        }

        // 4. LOAD KUIS WORDWALL
        val wordwallUrl = "https://wordwall.net/embed/9d27b5ee30094035828ac54add3250a9?themeId=1&templateId=5&fontStackId=0"

        // Gunakan Base URL agar fitur audio/fullscreen Wordwall tidak error
        val htmlData = """
            <!DOCTYPE html>
            <html>
            <head>
                <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
                <style>
                    body { margin: 0; padding: 0; background-color: #FFFFFF; overflow: hidden; }
                    iframe { position: absolute; top: 0; left: 0; width: 100%; height: 100%; border: none; }
                </style>
            </head>
            <body>
                <iframe src="$wordwallUrl" allowfullscreen></iframe>
            </body>
            </html>
        """.trimIndent()

        webView.loadDataWithBaseURL("https://wordwall.net", htmlData, "text/html", "utf-8", null)
    }
}