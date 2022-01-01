package com.step2hell.poker.card

import com.step2hell.poker.suit.Suit

class Eight(private val suit: Suit) : Card() {
    override fun toString() = "8[$suit]"
}
