package edu.temple.classactivity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myButton = findViewById<Button>(R.id.clickmeButton)

        val displayText = findViewById<TextView>(R.id.textView)

        val nameEditText = findViewById<EditText>(R.id.nameEditText)



        findViewById<Button>(R.id.clickmeButton).setOnClickListener {
            if (nameEditText.text.isNotEmpty()) {
                displayText.text = "Hello, ${nameEditText.text}!"
            } else {
                displayText.text = "Please enter your name"
            }
            nameEditText.text.clear()
        }


    }
}

