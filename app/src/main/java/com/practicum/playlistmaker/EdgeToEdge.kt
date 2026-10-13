package com.practicum.playlistmaker

import android.app.Activity
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding

fun View.applySystemBarsPadding() {
    val baseLeft = paddingLeft
    val baseTop = paddingTop
    val baseRight = paddingRight
    val baseBottom = paddingBottom

    ViewCompat.setOnApplyWindowInsetsListener(this) { v, insets ->
        val bars = insets.getInsets(
            WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
        )
        v.updatePadding(
            left = baseLeft + bars.left,
            top = baseTop + bars.top,
            right = baseRight + bars.right,
            bottom = baseBottom + bars.bottom
        )
        WindowInsetsCompat.CONSUMED
    }
}

fun Activity.setupHeader(@StringRes titleRes: Int, showBack: Boolean = true) {
    findViewById<TextView>(R.id.header_title).setText(titleRes)
    findViewById<ImageButton>(R.id.header_back).apply {
        visibility = if (showBack) View.VISIBLE else View.GONE
        setOnClickListener { finish() }
    }
}