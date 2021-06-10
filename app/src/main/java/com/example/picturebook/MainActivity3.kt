package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        var btnPrevious2=findViewById<Button>(R.id.btnprevious2)
        var btnNext3=findViewById<Button>(R.id.btnNext3)
        var tvflower=findViewById<TextView>(R.id.tvflower)

        btnNext3.setOnClickListener {
            var intent=Intent(baseContext,MainActivity4::class.java)
            startActivity(intent)
        }
        btnPrevious2.setOnClickListener {
            var intent=Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}