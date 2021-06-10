package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var btnPrevious1=findViewById<Button>(R.id.btnprevious1)
        var btnnext2=findViewById<Button>(R.id.btnnext2)
        var tvhouse=findViewById<TextView>(R.id.tvhouse)

        btnnext2.setOnClickListener {
            var intent= Intent(baseContext,MainActivity3::class.java)
            startActivity(intent)
        }

        btnPrevious1.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }

    }
}