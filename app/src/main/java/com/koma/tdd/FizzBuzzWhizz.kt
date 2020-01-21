package com.koma.tdd

class FizzBuzzWhizz {
    fun reportNumber(targetNumber: Int): String {
        if (isNormalNumber(targetNumber)) {
            return targetNumber.toString()
        }

        var outputNumber = ""
        // 规则7
        if (contains7(targetNumber)) {
            // 规则4、规则5
            if (contains3(targetNumber)) {
                outputNumber = "$outputNumber$FIZZ"
                return outputNumber
            }
            if (divisible3(targetNumber)) {
                outputNumber = "$outputNumber$FIZZ"
            }
        } else {
            // 规则6
            if (!contains5(targetNumber)) {
                // 规则4、规则5
                if (contains3(targetNumber)) {
                    outputNumber = "$outputNumber$FIZZ"
                    return outputNumber
                }
                if (divisible3(targetNumber)) {
                    outputNumber = "$outputNumber$FIZZ"
                }
            }
            if (divisible5(targetNumber)) {
                outputNumber = "$outputNumber$BUZZ"
            }
        }

        if (divisible7(targetNumber)) {
            outputNumber = "$outputNumber$WHIZZ"
        }

        return outputNumber
    }

    private fun isNormalNumber(targetNumber: Int): Boolean {
        return !(divisible3(targetNumber) || divisible5(targetNumber) || divisible7(targetNumber)
                || contains3(targetNumber) || contains5(targetNumber) || contains7(targetNumber))
    }

    private fun divisible3(targetNumber: Int) = targetNumber % 3 == 0

    private fun divisible5(targetNumber: Int) = targetNumber % 5 == 0

    private fun divisible7(targetNumber: Int) = targetNumber % 7 == 0

    private fun contains3(targetNumber: Int): Boolean {
        return targetNumber.toString().contains('3')
    }

    private fun contains5(targetNumber: Int): Boolean {
        return targetNumber.toString().contains('5')
    }

    private fun contains7(targetNumber: Int): Boolean {
        return targetNumber.toString().contains('7')
    }

    companion object {
        private const val FIZZ = "Fizz"
        private const val BUZZ = "Buzz"
        private const val WHIZZ = "Whizz"
    }
}
