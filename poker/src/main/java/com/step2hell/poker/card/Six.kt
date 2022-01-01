package com.step2hell.poker.card

import com.step2hell.poker.suit.Suit

class Six(private val suit: Suit) : Card() {
    override fun toString() = "6[$suit]"
}
