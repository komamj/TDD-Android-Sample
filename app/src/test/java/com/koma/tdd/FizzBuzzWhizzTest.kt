package com.koma.tdd

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class FizzBuzzWhizzTest {
    private lateinit var fizzBuzzWhizz: FizzBuzzWhizz

    @Before
    fun init() {
        fizzBuzzWhizz = FizzBuzzWhizz()
    }

    @Test
    fun `should return "1" when reportNumber called with input 1`() {
        val targetNumber = 1

        val result = fizzBuzzWhizz.reportNumber(targetNumber)

        assertThat(result).isEqualTo("1")
    }

    @Test
    fun `should return "2" when reportNumber called with input 2`() {
        val targetNumber = 2

        val result = fizzBuzzWhizz.reportNumber(targetNumber)

        assertThat(result).isEqualTo("2")
    }

    @Test
    fun `should return "Fizz" when reportNumber called with input 3`() {
        val targetNumber = 3

        val result = fizzBuzzWhizz.reportNumber(targetNumber)

        assertThat(result).isEqualTo("Fizz")
    }

    @Test
    fun `should return "Buzz" when reportNumber called with input 5`() {
        val targetNumber = 5

        val result = fizzBuzzWhizz.reportNumber(targetNumber)

        assertThat(result).isEqualTo("Buzz")
    }

    @Test
    fun `should return "Whizz" when reportNumber called with input 7`() {
        val targetNumber = 7

        val result = fizzBuzzWhizz.reportNumber(targetNumber)

        assertThat(result).isEqualTo("Whizz")
    }

    @Test
    fun `should return "FizzBuzz" when reportNumber called with input 60`() {
        val targetNumber = 60

        val result = fizzBuzzWhizz.reportNumber(targetNumber)

        assertThat(result).isEqualTo("FizzBuzz")
    }

    @Test
    fun `should return "FizzWhizz" when reportNumber called with input 21`() {
        val targetNumber = 21

        val result = fizzBuzzWhizz.reportNumber(targetNumber)

        assertThat(result).isEqualTo("FizzWhizz")
    }

    @Test
    fun `should return "BuzzWhizz" when reportNumber called with input 140`() {
        val targetNumber = 140

        val result = fizzBuzzWhizz.reportNumber(targetNumber)

        assertThat(result).isEqualTo("BuzzWhizz")
    }

    @Test
    fun `should return "FizzBuzzWhizz" when reportNumber called with input 210`() {
        val targetNumber = 210

        val result = fizzBuzzWhizz.reportNumber(targetNumber)

        assertThat(result).isEqualTo("FizzBuzzWhizz")
    }

    @Test
    fun `should return "Fizz" when reportNumber called with input 13`() {
        val targetNumber = 13

        val result = fizzBuzzWhizz.reportNumber(targetNumber)

        assertThat(result).isEqualTo("Fizz")
    }

    @Test
    fun `should return "Fizz" when reportNumber called with input 30`() {
        val targetNumber = 30

        val result = fizzBuzzWhizz.reportNumber(targetNumber)

        assertThat(result).isEqualTo("Fizz")
    }

    @Test
    fun `should return "BuzzWhizz" when reportNumber called with input 35`() {
        val targetNumber = 35

        val result = fizzBuzzWhizz.reportNumber(targetNumber)

        assertThat(result).isEqualTo("BuzzWhizz")
    }

    @Test
    fun `should return "Fizz" when reportNumber called with input 75`() {
        val targetNumber = 75

        val result = fizzBuzzWhizz.reportNumber(targetNumber)

        assertThat(result).isEqualTo("Fizz")
    }
}