package com.step2hell.fkll

import com.step2hell.poker.card.Ace
import com.step2hell.poker.card.Joker
import com.step2hell.poker.suit.Suit

fun main() {
    // todo
    val s = Suit.Heart
    val a = Ace(Suit.Spade)
    val rj = Joker.Red
    val bj = Joker.Black
    println("s=$s a=$a rj=$rj bj=$bj")
}
