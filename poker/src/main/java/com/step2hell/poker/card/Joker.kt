package com.step2hell.poker.card

sealed class Joker(private val value: String) : Card() {
    object Black : Joker("B")
    object Red : Joker("R")

    override fun toString() = "\uD83C\uDCCF[$value]"    //🃏
}
