package com.testlslavag76.lesson1_kotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initCount()
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello, Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun initCount() {

        var textView = findViewById<TextView>(R.id.textView)
        var buttonCount = findViewById<Button>(R.id.countButton)

        buttonCount.setOnClickListener {
            count++
            textView.text = count.toString()
        }

    }
}