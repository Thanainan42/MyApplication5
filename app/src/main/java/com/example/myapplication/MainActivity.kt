package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var Num = editTextNumberDecimal.text.toString()
            var Num2 = editTextNumberDecimal2.text.toString()
            if (Num.isEmpty() || Num2.isEmpty())
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            textView4.text = "+"
            textView6.text = (Num.toDouble() + Num2.toDouble()).toString()
        }
        button2.setOnClickListener {
            var Num = editTextNumberDecimal.text.toString()
            var Num2 = editTextNumberDecimal2.text.toString()
            if (Num.isEmpty() || Num2.isEmpty())
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            textView4.text = "-"
            textView6.text = (Num.toDouble() - Num2.toDouble()).toString()
        }
        button3.setOnClickListener {
            var Num = editTextNumberDecimal.text.toString()
            var Num2 = editTextNumberDecimal2.text.toString()
            if (Num.isEmpty() || Num2.isEmpty())
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            textView4.text = "*"
            textView6.text = (Num.toDouble() * Num2.toDouble()).toString()
        }
        button4.setOnClickListener {
            var Num = editTextNumberDecimal.text.toString()
            var Num2 = editTextNumberDecimal2.text.toString()
            if (Num.isEmpty() || Num2.isEmpty())
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            textView4.text = "/"
            textView6.text = (Num.toDouble() / Num2.toDouble()).toString()
        }
        button5.setOnClickListener {
            var Num = editTextNumberDecimal.text.toString()
            var Num2 = editTextNumberDecimal2.text.toString()
            if (Num.isEmpty() || Num2.isEmpty())
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            textView4.text = "%"
            textView6.text = (Num.toDouble() % Num2.toDouble()).toString()
        }
        button6.setOnClickListener {
            editTextNumberDecimal.text.clear()
            editTextNumberDecimal2.text.clear()
            textView4.text = " "
            textView6.text = " "
        }
    }
}