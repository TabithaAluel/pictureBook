package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnNext1=findViewById<Button>(R.id.btnNext1)
        var tvSentence=findViewById<TextView>(R.id.tvSentence)



        btnNext1.setOnClickListener {
            var intent= Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)
    }
         }
     }
