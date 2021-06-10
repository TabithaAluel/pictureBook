package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

         var btnprevious3=findViewById<Button>(R.id.btnprevious3)
         var btnNext4=findViewById<Button>(R.id.btnNext4)
        var tvnovel=findViewById<TextView>(R.id.tvnovel)

        btnNext4.setOnClickListener {
            var intent= Intent(baseContext,MainActivity5::class.java)
            startActivity(intent)
        }
        btnprevious3.setOnClickListener {
            var intent = Intent(baseContext,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}