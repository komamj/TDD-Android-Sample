package com.koma.tdd

class FizzBuzzWhizz {
    fun reportNumber(targetNumber: Int): String {
        if (!(divisible3(targetNumber) || divisible5(targetNumber) || divisible7(targetNumber))) {
            return targetNumber.toString()
        }

        var outputNumber = ""
        if (divisible3(targetNumber)) {
            outputNumber = "$outputNumber$FIZZ"
        }
        if (divisible5(targetNumber)) {
            outputNumber = "$outputNumber$BUZZ"
        }
        if (divisible7(targetNumber)) {
            outputNumber = "$outputNumber$WHIZZ"
        }

        return outputNumber
    }

    private fun divisible3(targetNumber: Int) = targetNumber % 3 == 0

    private fun divisible5(targetNumber: Int) = targetNumber % 5 == 0

    private fun divisible7(targetNumber: Int) = targetNumber % 7 == 0

    companion object {
        private const val FIZZ = "Fizz"
        private const val BUZZ = "Buzz"
        private const val WHIZZ = "Whizz"
    }
}
