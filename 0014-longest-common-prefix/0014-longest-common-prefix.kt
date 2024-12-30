class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        /*
            small -> flow
            flower, flow -> flow
            flight, flow -> fl
        */

        if(strs.size == 1) return strs[0]

        var small = ""
        var min = 999
        var output = ""
        for(i in strs){
            if(min > i.length){
                min = i.length
                small = i    
            }
        }

        for(i in small.length downTo 0){         
            var count = 0 
            for(j in strs){
                if(j.substring(0, i) == small.substring(0, i)) count++
            }
            if(count == strs.size){          
                    output = small.substring(0, i)
                    break
            } 
        }

        return output
    }
}