class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        /*

         */
        
        val arr = IntArray(2)
        for(i in 0 until nums.size){
            for(j in 0 until nums.size){
                if(nums[i] + nums[j] == target && i != j){
                    arr[0] = i
                    arr[1] = j
                }
            }
        }

        return arr
    }
}