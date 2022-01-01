package com.step2hell.poker.card

import com.step2hell.poker.suit.Suit

class Five(private val suit: Suit) : Card() {
    override fun toString() = "5[$suit]"
}
