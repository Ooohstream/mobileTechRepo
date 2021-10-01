package com.example.firstlab

data class NumberList (val numbers: List<Int>){
    fun getRepeatingElements(): List<Int>{
        return numbers.groupingBy { it }.eachCount().filter { el -> el.component2() > 1 }.keys.toList()
    }
}