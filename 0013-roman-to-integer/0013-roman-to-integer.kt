class Solution {
    fun romanToInt(s: String): Int {
        var i = 0
        var j = i+2
        val temp = s+"_"
        var output = 0
        while(i <= temp.length && j<= temp.length){
            val subTemp = temp.substring(i, j)
            val result = checkValues(subTemp)
            if(result == 0){     
                output += checkValues(temp[i].toString())
            }else{
                output += result              
                i++
                j++
            }
            i++
            j++   
        }
    return output
    }
    
    fun checkValues(s:String): Int{
        val dict = mapOf("I" to 1,"II" to 2,"III" to 3, "V" to 5, "X" to 10,"L" to 50,"C" to 100,"D" to 500, "M" to 1000, "IV" to 4, "IX" to 9, "XL" to 40,"XC" to 90,"CD" to 400,"CM" to 900)
        if(dict.containsKey(s)) return dict.getValue(s)
        return 0
    }
}