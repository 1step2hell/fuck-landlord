package com.step2hell.poker.util

val Int.isOdd: Boolean
    get() = (this and 1) == 1

val Int.isEven: Boolean
    get() = (this and 1) == 0
