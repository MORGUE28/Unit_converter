package com.example.unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.*
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.DecimalFormat

class Activityarea : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activityarea)

        val inputArea = findViewById<EditText>(R.id.inputArea)
        val outputArea = findViewById<TextView>(R.id.outputArea)
        val convert = findViewById<Button>(R.id.convArea)

        convert.setOnClickListener {
            val inpVal:Double = inputArea.text.toString().toDouble()
            val convtoAcre: Double = (inpVal/4047)
            outputArea.text = DecimalFormat("0.###").format(convtoAcre).toString() + " Acre"
        }

        val back = findViewById<FloatingActionButton>(R.id.back1)
        back.setOnClickListener {
            val intent = Intent( /* packageContext = */ this, /* cls = */ MainActivity::class.java)
            startActivity(intent)
        }
    }
}