package com.example.stayin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PresentationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presentation)
        this.supportActionBar?.hide()

    }
}