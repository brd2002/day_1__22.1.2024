package com.example.colormyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListens()
    }

    private fun setListens() {
//        val clickableViews : List<View> = listOf(box_one_text , )
    }
}