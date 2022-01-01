package com.step2hell.poker.util

fun <T> shuffle(list: MutableList<T>) {
    for (i in list.size - 1 downTo 0) {
        val random = (0..i).random()
        list[i] = list[random].also { list[random] = list[i] }
    }
}
