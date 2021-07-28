package com.testlslavag76.lesson1_kotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    var count: Int = 0
    var user1 = User("Jone", "Smith")
    var user2 = User();




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initCount()

        initPrintUserName()

        initPrintObject()

    }

    object ObjectName
  fun initPrintObject() {

        var btnPrintObject = findViewById<Button>(R.id.buttonObject)
        var textViewObject = findViewById<TextView>(R.id.textObject)

      btnPrintObject.setOnClickListener(){
          textViewObject.text = ObjectName.toString()
      }

    }

    fun initPrintUserName() {
        var btnPrintUser = findViewById<Button>(R.id.buttonPrintUserName)
        var textViewUser1 = findViewById<TextView>(R.id.user1TextField)
        var textViewUser2 = findViewById<TextView>(R.id.user2TextField)

        btnPrintUser.setOnClickListener() {
            textViewUser1.text = user1.firstName + user1.secondName
            textViewUser2.text = user2.firstName + user2.secondName

        }
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