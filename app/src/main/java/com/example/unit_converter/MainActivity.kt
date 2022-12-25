package com.example.unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.*
import android.widget.*
import android.view.*
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gtlen = findViewById<AppCompatButton>(R.id.lenbtn)
        val gtarea = findViewById<AppCompatButton>(R.id.areabtn)
        val gttemp = findViewById<AppCompatButton>(R.id.tempbtn)
        val gtvol = findViewById<AppCompatButton>(R.id.volbtn)

        gtlen.setOnClickListener {
            val intent = Intent(this, Activitylen::class.java)
            startActivity(intent)
        }
        gtarea.setOnClickListener {
            val intent = Intent(this, Activityarea::class.java)
            startActivity(intent)
        }
        gttemp.setOnClickListener {
            val intent = Intent(this, Activitytemp::class.java)
            startActivity(intent)
        }
        gtvol.setOnClickListener {
            val intent = Intent(this, Activityvol::class.java)
            startActivity(intent)
        }
    }
}