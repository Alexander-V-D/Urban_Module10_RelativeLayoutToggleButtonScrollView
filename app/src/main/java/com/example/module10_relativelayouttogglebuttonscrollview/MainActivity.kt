package com.example.module10_relativelayouttogglebuttonscrollview

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var loadBTN: Button
    private lateinit var loadedTextTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadBTN = findViewById(R.id.loadBTN)
        loadedTextTV = findViewById(R.id.loadedTextTV)

        loadBTN.setOnClickListener {
            loadBook(database().text).forEach {
                loadedTextTV.append("$it ")
            }
        }
    }

    private fun loadBook(text: String): List<String> {
        return text.split(" ")
    }
}