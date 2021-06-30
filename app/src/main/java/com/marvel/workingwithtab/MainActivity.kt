package com.marvel.workingwithtab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import com.marvel.workingwithtab.databinding.ActivityMainBinding
import com.marvel.workingwithtab.viewtab.WatsappAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var whatsAppAdapter: WatsappAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        whatsAppAdapter = WatsappAdapter(supportFragmentManager)
        binding.pager.adapter = whatsAppAdapter
    }
}