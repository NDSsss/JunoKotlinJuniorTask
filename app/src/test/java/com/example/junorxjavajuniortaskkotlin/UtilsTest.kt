package com.example.junorxjavajuniortaskkotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test

class UtilsTest {
    @Test
    fun testGetSumFromTextSuccess() {
        assert((getSumFromText("2dddd2") == "4") or(getSumFromText("2dddd2") == "4.0"))
    }

    @Test
    fun testGetSumFromTextNegative() {
        assert((getSumFromText("4dddd-2")=="2") || (getSumFromText("4dddd-2") == "2.0"))
    }

    @Test
    fun testGetSumFromTextDouble() {
        assertEquals("1.5", getSumFromText("4dddd-2.5"))
    }
}