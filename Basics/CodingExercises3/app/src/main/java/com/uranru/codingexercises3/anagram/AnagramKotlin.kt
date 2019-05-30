package com.uranru.codingexercises3.anagram

// Create a function to check if the two strings are Anagrams
// Eg COAT and TACO would be anagrams

class AnagramKotlin {
    fun isAnagram(word: String, word2: String): Boolean {
        val formattedWord = word.toLowerCase().trim()
        val formattedWord2 = word2.toLowerCase().trim()
        //compare lengths
        if (formattedWord.length != formattedWord2.length) return false

        //compare letters
        val wordMap = formattedWord.toList().groupingBy { it }.eachCount()
        val wordMap2 = formattedWord2.toList().groupingBy { it }.eachCount()
        return (wordMap == wordMap2)

    }


    fun containsSameChars(word: String, word2: String) =
        word.toLowerCase().trim().toList().sorted() == word2.toLowerCase().trim().toList().sorted()
}
