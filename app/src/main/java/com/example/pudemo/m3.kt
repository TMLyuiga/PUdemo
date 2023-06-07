package com.example.pudemo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class m3 : AppCompatActivity() {
    lateinit var imgbtn_b9: ImageButton
    lateinit var imgbtn_b10: ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m3)

        imgbtn_b9 = findViewById(R.id.imgbtn_b9)
        imgbtn_b10 = findViewById(R.id.imgbtn_b10)

        imgbtn_b9.setOnClickListener {
            val intent = Intent(this, b9::class.java)
            startActivity(intent)
        }
        imgbtn_b10.setOnClickListener {
            val intent = Intent(this, b10::class.java)
            startActivity(intent)
        }
    }
}