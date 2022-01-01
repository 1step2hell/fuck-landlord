package com.step2hell.poker.card

import com.step2hell.poker.suit.Suit

class Ten(private val suit: Suit) : Card() {
    override fun toString() = "10[$suit]"
}
