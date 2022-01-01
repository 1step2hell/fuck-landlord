package com.step2hell.poker.card

import com.step2hell.poker.suit.Suit

class Four(private val suit: Suit) : Card() {
    override fun toString() = "4[$suit]"
}
