package com.example.junorxjavajuniortaskkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        act_main_input_et.writeSumToTv(act_main_answer_tv) { getSumFromText(it) }
    }
}