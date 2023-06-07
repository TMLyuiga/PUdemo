package com.example.pudemo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class m5 : AppCompatActivity() {
    lateinit var test: ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m5)

        test = findViewById(R.id.imgbtn_b14)

        test.setOnClickListener {
            val intent = Intent(this, b14::class.java)
            startActivity(intent)
        }
    }
}