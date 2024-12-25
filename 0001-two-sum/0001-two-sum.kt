class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        /*
        a + b = target
        3 + 2 != 6
        2 + 4 = 6
         */
            
        val arr = IntArray(2)
        var left = 0
        var right = nums.size-1
        while(left < nums.size ){
            if(nums[left] + nums[right] == target && left != right){
                arr[0] = left
                arr[1] = right
                break
            }
            if(right == left){
                left++
                right = nums.size-1
            }else{            
                right--
            } 
        }
        return arr
    }
}