package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)


        var btnprevious4 = findViewById<Button>(R.id.btnprevious4)
        var tvmountain = findViewById<TextView>(R.id.tvmountain)

        btnprevious4.setOnClickListener {
            var intent = Intent(baseContext, MainActivity4::class.java)
            startActivity(intent)
        }

    }
}

