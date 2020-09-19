package com.example.fixedreminder.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fixedreminder.R
import com.example.fixedreminder.base.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}