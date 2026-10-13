package com.practicum.playlistmaker

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MediaLibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_media_library)
        findViewById<View>(R.id.media_library).applySystemBarsPadding()
        setupHeader(R.string.media_library, showBack = false)
    }
}