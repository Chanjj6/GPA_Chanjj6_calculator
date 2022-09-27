package com.example.gpacalculator

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var x: Button
    private lateinit var y : TextView
    private lateinit var c1 : EditText
    private lateinit var c2 : EditText
    private lateinit var c3 : EditText
    private lateinit var c4 : EditText
    private lateinit var c5 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        x = findViewById(R.id.x)
        x.setOnClickListener {findAvg()}
        y = findViewById(R.id.y)


    }

    private fun findAvg(){
        c1 = findViewById(R.id.c1)
        c2 = findViewById(R.id.c2)
        c3 = findViewById(R.id.c3)
        c4 = findViewById(R.id.c4)
        c5 = findViewById(R.id.c5)
        val avg: Float
        val g1: Float = c1.text.toString().toFloat()
        val g2: Float = c2.text.toString().toFloat()
        val g3: Float = c3.text.toString().toFloat()
        val g4: Float = c4.text.toString().toFloat()
        val g5: Float = c5.text.toString().toFloat()
        avg = (g1+g2+g3+g4+g5)/5
        if (avg < 60){
            y.text = avg.toString()
            y.setBackgroundColor(Color.RED)
        }
        else if(avg>60 && avg<80){
            y.text = avg.toString()
            y.setBackgroundColor(Color.YELLOW)
        }
        else if(avg>80 && avg<100){
            y.text = avg.toString()
            y.setBackgroundColor(Color.GREEN)
        }
        else{
            y.text = "Number too high or too low"
        }
        if(c1.toString() == " " || c2.toString() == " " || c3.toString() == " " || c4.toString() == " " || c5.toString() == " " ){
            y.text = "Please input a grade for a course"
        }
    }
}