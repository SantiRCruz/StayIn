package com.example.stayin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stayin.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        this.supportActionBar?.hide()
    }
}