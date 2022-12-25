package com.example.unit_converter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.*
import android.widget.*
import android.view.*
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.DecimalFormat

class Activitylen : AppCompatActivity() {
    //val lenlist = listOf()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitylen)

        val inputLen = findViewById<EditText>(R.id.inputLen)
        val outputLen = findViewById<TextView>(R.id.outputLen)
        val convert = findViewById<Button>(R.id.convLen)

        convert.setOnClickListener {
            val inpVal:Double = inputLen.text.toString().toDouble()
            val convtoMile: Double = inpVal * 0.621
            outputLen.text = DecimalFormat("0.###").format(convtoMile).toString() +" Miles"
        }
        val back = findViewById<FloatingActionButton>(R.id.back3)
        back.setOnClickListener {
            val intent = Intent( /* packageContext = */ this, /* cls = */ MainActivity::class.java)
            startActivity(intent)
        }

    }
}