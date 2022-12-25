package com.example.unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.*
import android.widget.*
import android.view.*
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.DecimalFormat

class Activitytemp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitytemp)

        val inputTemp = findViewById<EditText>(R.id.inputTemp)
        val outputTemp = findViewById<TextView>(R.id.outputTemp)
        val convert = findViewById<Button>(R.id.convTemp)

        convert.setOnClickListener {
            val inpVal:Double = inputTemp.text.toString().toDouble()
            val convtoFah: Double = (inpVal * 1.8) + 32
            outputTemp.text = DecimalFormat("0.###").format(convtoFah).toString() + "°F"
        }
        val back = findViewById<FloatingActionButton>(R.id.back3)
        back.setOnClickListener {
            val intent = Intent( /* packageContext = */ this, /* cls = */ MainActivity::class.java)
            startActivity(intent)
        }
    }
}