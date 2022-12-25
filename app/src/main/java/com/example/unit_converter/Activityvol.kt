package com.example.unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.*
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.DecimalFormat

class Activityvol : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activityvol)

        val inputVol = findViewById<EditText>(R.id.inputVol)
        val outputVol = findViewById<TextView>(R.id.outputVol)
        val convert = findViewById<Button>(R.id.convVol)

        convert.setOnClickListener {
            val inpVal:Double = inputVol.text.toString().toDouble()
            val convtoLit: Double = (inpVal*1000)
            outputVol.text = DecimalFormat("0.###").format(convtoLit).toString() + " Litres"
        }

        val back = findViewById<FloatingActionButton>(R.id.back2)
        back.setOnClickListener {
            val intent = Intent( /* packageContext = */ this, /* cls = */ MainActivity::class.java)
            startActivity(intent)
        }
    }
}