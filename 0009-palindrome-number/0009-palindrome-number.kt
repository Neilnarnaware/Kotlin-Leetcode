class Solution {
    fun isPalindrome(x: Int): Boolean {
        /*
            reverse string == string
         */
        val straight = x.toString()
        var reverse = ""

        for(i in straight.length-1 downTo 0){
            reverse += straight[i]
        }
        return (straight == reverse)
    }
}