package subtask1
class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        // throw NotImplementedError("Not implemented")
        var happyArray = mutableListOf<Int>()
        for (i in sadArray) {
            happyArray.add(i)
        }
        if (happyArray.size != 0) {
            var showBad = true
            while (showBad) {
                for (element in 1 until happyArray.size) {
                    if (element != happyArray.size - 1) {
                        if (happyArray[element] > (happyArray[element - 1] + happyArray[element + 1])) {
                            happyArray.removeAt(element)
                            break
                        }
                    } else {
                        showBad = false;
                        break
                    }
                }
            }
        }
        return happyArray.toIntArray()

    }

}