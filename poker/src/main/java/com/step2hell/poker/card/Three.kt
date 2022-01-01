package com.step2hell.poker.card

import com.step2hell.poker.suit.Suit

class Three(private val suit: Suit) : Card() {
    override fun toString() = "3[$suit]"
}