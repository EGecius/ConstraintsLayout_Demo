package com.example.constraintslayout_demo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_group.*

class GroupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group)

        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        showViewsButton.setOnClickListener {
            group.visibility = View.VISIBLE
        }
        hideViewsButton.setOnClickListener {
            group.visibility = View.GONE
        }
    }
}