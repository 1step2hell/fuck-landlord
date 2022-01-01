package com.step2hell.poker.card

import com.step2hell.poker.suit.Suit

class King(private val suit: Suit) : Card() {
    override fun toString() = "K[$suit]"
}
