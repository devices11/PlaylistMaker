package com.practicum.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_settings)
        findViewById<View>(R.id.settings).applySystemBarsPadding()

        findViewById<TextView>(R.id.header_title).text = getString(R.string.settings)
        findViewById<ImageButton>(R.id.header_back).apply {
            visibility = View.VISIBLE
            setOnClickListener { finish() }
        }
    }
}