package com.step2hell.poker.card

import com.step2hell.poker.suit.Suit

class Ace(private val suit: Suit) : Card() {
    override fun toString() = "A[$suit]"
}
