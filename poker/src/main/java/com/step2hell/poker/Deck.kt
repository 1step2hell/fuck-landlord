package com.step2hell.poker

import com.step2hell.poker.card.*
import com.step2hell.poker.suit.Suit

object Deck {
    private val classes: List<Class<out Card>> = listOf(
        Two::class.java,
        Three::class.java,
        Four::class.java,
        Five::class.java,
        Six::class.java,
        Seven::class.java,
        Eight::class.java,
        Nine::class.java,
        Ten::class.java,
        Jack::class.java,
        Queen::class.java,
        King::class.java,
        Ace::class.java
    )

    val cards: MutableList<Card> = MutableList(54) {
        val index = it / 4
        val mod = it % 4
        if (it < 4 * classes.size) {
            val suit: Suit = when (mod) {
                0 -> Suit.Spade
                1 -> Suit.Heart
                2 -> Suit.Club
                else -> Suit.Diamond
            }
            classes[index].getDeclaredConstructor(Suit::class.java).newInstance(suit)
        } else {
            if (mod == 0) Joker.Black else Joker.Red
        }
    }

    fun print() {
        cards.forEachIndexed { index, card ->
            val newLine = if (index % 4 == 0) "\n" else ""
            // System.out.printf("%s\t", "$newLine$card")
            System.out.printf("%8s", "$newLine${alignRight(card.toString())}")
        }
    }

    private fun alignRight(src: String): String {
        val stringBuilder = StringBuilder()
        repeat(8 - src.length) { stringBuilder.append(" ") }
        return stringBuilder.append(src).toString()
    }
}
