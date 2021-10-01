package com.example.firstlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textViewBefore = findViewById<TextView>(R.id.textViewBefore)
        val textViewAfter = findViewById<TextView>(R.id.textViewAfter)
        val updateButton = findViewById<Button>(R.id.button)
        val nums = NumberList(List(10){ Random.nextInt(1, 10)});
        textViewBefore.text = nums.numbers.joinToString("\n")


        updateButton.setOnClickListener{
            textViewAfter.text = nums.getRepeatingElements().joinToString("\n")
        }
    }


}