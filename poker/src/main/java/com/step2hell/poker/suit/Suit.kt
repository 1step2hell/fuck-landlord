package com.step2hell.poker.suit

sealed class Suit(private val value: String) {
    object Spade : Suit("♠️")
    object Heart : Suit("♥️")
    object Club : Suit("♣️")
    object Diamond : Suit("♦️")

    override fun toString() = value

    companion object {
        fun from(mod: Int): Suit = when (mod % 4) {
            0 -> Spade
            1 -> Heart
            2 -> Club
            3 -> Diamond
            else -> throw IllegalStateException("This should never happen!")
        }
    }
}
