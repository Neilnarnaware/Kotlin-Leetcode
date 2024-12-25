class Solution {
    fun specialArray(nums: IntArray): Int {
        
        /*
            n = 5
            0 -> 2 -> 5-2 = 3
         */

        if(nums.size == 1 && nums[0] == 0) return -1
        var s = nums.size
        var special = 0
        
        nums.sort()
        for(i in 0 until nums.size){
            special = s - i
            if(special <= nums[i] && (i == 0 || special > nums[i-1])) return special
        }

        return -1
    }
}