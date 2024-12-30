class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        /*
            add both and sort
        */
        var first = nums1.size -1
        var second = 0

        while(nums1[first] == 0 && second < nums2.size){
            if(first == 0) nums1[first] = nums2[second]
            else{
                nums1[first] = nums2[second] //002, 052, 652
                first-- //4, 3, 2
                second++ //1, 2, 3
            }
        }
        nums1.sort()
    }
}