class Solution {
    fun minimumOperations(nums: IntArray): Int {
        
        /*
            1,3,5 -> 3
         */
        
        val set = mutableSetOf<Int>()
        for(i in nums){
            if(i != 0) set.add(i)
        }

        return set.size
    }
}