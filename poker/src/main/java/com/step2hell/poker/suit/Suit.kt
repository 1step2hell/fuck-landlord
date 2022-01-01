package com.step2hell.poker.suit

sealed class Suit(private val value: String) {
    object Spade : Suit("♠️")
    object Heart : Suit("♥️")
    object Club : Suit("♣️")
    object Diamond : Suit("♦️")

    override fun toString() = value
}
