package com.practicum.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.main).applySystemBarsPadding()

        val title = findViewById<TextView>(R.id.header_title)
        title.text = getString(R.string.app_name)
        title.setTextColor(getColor(R.color.header_on_main))

        val btnSearch = findViewById<Button>(R.id.btn_search)
        val searchClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Поиск", Toast.LENGTH_SHORT).show()
            }
        }
        btnSearch.setOnClickListener(searchClickListener)

        findViewById<Button>(R.id.btn_media).setOnClickListener {
            Toast.makeText(this, "Медиатека", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btn_settings).setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}