package com.example.pudemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {

    lateinit var imgbtn_1: ImageButton
    lateinit var imgbtn_2: ImageButton
    lateinit var imgbtn_3: ImageButton
    lateinit var imgbtn_4: ImageButton
    lateinit var imgbtn_5: ImageButton
    lateinit var imgbtn_6: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgbtn_1=findViewById(R.id.imgbtn_1)
        imgbtn_2=findViewById(R.id.imgbtn_2)
        imgbtn_3=findViewById(R.id.imgbtn_3)
        imgbtn_4=findViewById(R.id.imgbtn_4)
        imgbtn_5=findViewById(R.id.imgbtn_5)
        imgbtn_6=findViewById(R.id.imgbtn_6)

        imgbtn_1.setOnClickListener{
            val intent= Intent(this, m2::class.java)
            startActivity(intent)
        }
        imgbtn_2.setOnClickListener{
            val intent= Intent(this, m3::class.java)
            startActivity(intent)
        }
        imgbtn_3.setOnClickListener{
            val intent= Intent(this, m4::class.java)
            startActivity(intent)
        }
        imgbtn_4.setOnClickListener{
            val intent= Intent(this, m5::class.java)
            startActivity(intent)
        }
        imgbtn_5.setOnClickListener{
            val intent= Intent(this, m6::class.java)
            startActivity(intent)
        }
        imgbtn_6.setOnClickListener{
            val intent= Intent(this, m7::class.java)
            startActivity(intent)
        }

    }
}