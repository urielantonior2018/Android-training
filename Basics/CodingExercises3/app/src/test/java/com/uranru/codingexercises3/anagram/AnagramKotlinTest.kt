package com.uranru.codingexercises3.anagram

import org.junit.Test

import org.junit.Assert.*

class AnagramKotlinTest {

    @Test
    fun isAnagram1() {
        val classInstance = AnagramKotlin()
        val result = classInstance.isAnagram("coat", "taco")
        assertTrue(result)
    }

    @Test
    fun isAnagram2() {
        val classInstance = AnagramKotlin()
        val result = classInstance.isAnagram("asa", "ass")
        assertFalse(result)
    }

    @Test
    fun isAnagram3() {
        val classInstance = AnagramKotlin()
        val result = classInstance.isAnagram("COAT ", "taco")
        assertTrue(result)
    }

    @Test
    fun isAnagram4() {
        val classInstance = AnagramKotlin()
        val result = classInstance.containsSameChars("coat", "taco")
        assertTrue(result)
    }

    @Test
    fun isAnagram5() {
        val classInstance = AnagramKotlin()
        val result = classInstance.containsSameChars("asa", "ass")
        assertFalse(result)
    }

    @Test
    fun isAnagram6() {
        val classInstance = AnagramKotlin()
        val result = classInstance.containsSameChars("COAT ", "taco")
        assertTrue(result)
    }
}