package com.step2hell.poker.card

import com.step2hell.poker.suit.Suit

class Nine(private val suit: Suit) : Card() {
    override fun toString() = "9[$suit]"
}
