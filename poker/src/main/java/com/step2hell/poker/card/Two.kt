package com.step2hell.poker.card

import com.step2hell.poker.suit.Suit

class Two(private val suit: Suit) : Card() {
    override fun toString() = "2[$suit]"
}