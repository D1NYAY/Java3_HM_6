package com.example.java3_hm_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.container_first, FirstFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_second, RecyclerFragment()).commit()
    }
}