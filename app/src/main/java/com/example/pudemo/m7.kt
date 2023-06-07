package com.example.pudemo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class m7 : AppCompatActivity() {
    lateinit var imgbtn_b16: ImageButton
    lateinit var imgbtn_b17: ImageButton
    lateinit var imgbtn_b18: ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m7)

        imgbtn_b16 = findViewById(R.id.imgbtn_b16)
        imgbtn_b17 = findViewById(R.id.imgbtn_b17)
        imgbtn_b18 = findViewById(R.id.imgbtn_b18)

        imgbtn_b16.setOnClickListener {
            val intent = Intent(this, b16::class.java)
            startActivity(intent)
        }
        imgbtn_b17.setOnClickListener {
            val intent = Intent(this, b17::class.java)
            startActivity(intent)
        }
        imgbtn_b18.setOnClickListener {
            val intent = Intent(this, b18::class.java)
            startActivity(intent)
        }
    }
}