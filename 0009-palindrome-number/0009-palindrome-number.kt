class Solution {
    fun isPalindrome(x: Int): Boolean {
        /*
            reverse string == string
         */
        return (x.toString() == x.toString().reversed())
    }
}