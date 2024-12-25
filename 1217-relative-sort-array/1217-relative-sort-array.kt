class Solution {
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        /*
            arr2 -> key
            arr1 -> value
         */
        if(arr1.size == 1 && arr2.size == 1 && arr1[0] == arr2[0]) return arr2
        var inArr = IntArray(0)
        var outArr = IntArray(0)
        var hmap = mutableMapOf<Int, Int>()

        for(i in 0 until arr2.size){
            hmap.put(arr2[i], i)
        }

        hmap.forEach{ (key, value) ->
            for(i in 0 until arr1.size){
                if(arr1[i] == key) inArr += arr1[i]
            }
        }

        for(i in arr1){
            if(!hmap.containsKey(i)) outArr += i
        }
        outArr.sort()
        return inArr + outArr
    }
}