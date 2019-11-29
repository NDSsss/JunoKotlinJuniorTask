package com.example.junorxjavajuniortaskkotlin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //TODO: Добавить extension для TextView в файл Utils, который будет зазываться writeSumToTv
    // что бы можно заменить строки с 19 по 27 на 1 строку
    // act_main_input_et.writeSumToTv(act_main_answer_tv) { getSumFromText(it) }
    // И замените их

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        act_main_input_et.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                act_main_answer_tv.setText(getSumFromText(p0.toString()))
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
        })
    }
}