package com.example.chapter4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        val message = intent.getStringExtra("inputEditMessage") ?: "없음음"
       Log.d("intentMessage", message)
    }
}