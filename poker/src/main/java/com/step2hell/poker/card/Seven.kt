package com.step2hell.poker.card

import com.step2hell.poker.suit.Suit

class Seven(private val suit: Suit) : Card() {
    override fun toString() = "7[$suit]"
}
