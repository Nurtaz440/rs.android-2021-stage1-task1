package subtask2
class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        //throw NotImplementedError("Not implemented")

       var costDish=0

        for((index,i) in bill.withIndex() ) {
            if (index != k) {

                costDish += i


            }

        }
         return when (val anna=(costDish)/2){

         b-> {
             ("Bon Appetit")

         }else -> {
                 val lent = (b - anna)
                 (lent).toString()
             }
        }
    }
}
