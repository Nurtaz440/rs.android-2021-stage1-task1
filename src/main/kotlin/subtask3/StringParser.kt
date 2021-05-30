package subtask3

import java.util.regex.Pattern

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        //  throw NotImplementedError("Not implemented")


        val leftRoundBracket: Char = 40.toChar()
        val rightRoundBracket: Char = 41.toChar()


        val leftSquareBracket: Char = 91.toChar()
        val rightSquareBracket: Char = 93.toChar()



        val leftDiamondBracket: Char = 60.toChar()
        val rightDiamondBracket: Char = 62.toChar()



        val array = arrayListOf<String>()
        for ((index, i) in inputString.withIndex()) {
            if (leftRoundBracket == i) {
                var counter = 1
                val builder = StringBuilder()
                for (j in index + 1 until inputString.length) {
                    if (inputString[j] == leftRoundBracket) {
                        builder.append(inputString[j])
                        counter++
                    } else if (inputString[j] != rightRoundBracket) {
                        builder.append(inputString[j])
                    } else if (inputString[j] == rightRoundBracket) {
                        if (counter == 1) {
                            array.add(builder.toString())
                            break
                        } else {
                            builder.append(inputString[j])
                            counter--
                        }
                    }
                }
            } else if (leftSquareBracket == i) {
                var counter = 1
                val stringBuilder = StringBuilder()

                for (j in index + 1 until inputString.length) {

                    if (inputString[j] == leftSquareBracket) {
                        stringBuilder.append(inputString[j])
                        counter++
                    } else if (inputString[j] != rightSquareBracket) {
                        stringBuilder.append(inputString[j])
                    } else if (inputString[j] == rightSquareBracket) {
                        if (counter == 1) {
                            array.add(stringBuilder.toString())
                            break
                        } else {
                            stringBuilder.append(inputString[j])
                            counter--
                        }
                    }
                }
            } else if (leftDiamondBracket == i) {
                var counter = 1
                val stringBuilder = StringBuilder()
                for (j in index + 1 until inputString.length) {
                    if (inputString[j] == leftDiamondBracket) {
                        stringBuilder.append(inputString[j])
                        counter++
                    } else if (inputString[j] != rightDiamondBracket) {
                        stringBuilder.append(inputString[j])
                    } else if (inputString[j] == rightDiamondBracket) {
                        if (counter == 1) {
                            array.add(stringBuilder.toString())
                            break
                        } else {
                            stringBuilder.append(inputString[j])
                            counter--
                        }
                    }
                }
            }

        }
        return array.toTypedArray()
    }

        }
