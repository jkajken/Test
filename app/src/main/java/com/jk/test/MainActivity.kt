package com.jk.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jk.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            calculateBtn.setOnClickListener {
                resultTv.text = Math().add(firstEt.text.toString(),secondEt.text.toString())
            }
        }
    }
}