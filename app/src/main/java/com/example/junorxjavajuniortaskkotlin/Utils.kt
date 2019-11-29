package com.example.junorxjavajuniortaskkotlin

import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import java.util.regex.Pattern

fun getSumFromText(text: String): String = Pattern.compile("[0-9-]+\\.?[0-9]*").toRegex().findAll(text)
    .map { it.value.toDoubleOrNull() ?: 0.0 }
    .filter { it != 0.0 }
    .sumByDouble { ddd -> ddd }
    .toString()

inline fun TextView.writeSumToTv(answer: TextView, crossinline getSum: (String) -> String) {
    this.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {
            answer.setText(getSum(p0.toString()))
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
    })
}