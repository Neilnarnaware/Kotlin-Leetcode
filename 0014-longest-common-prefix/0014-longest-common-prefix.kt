class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        
        /*
        flow smallest.
        flow in flower, flight  
        flo in flower, flight
        fl in flower, flight
        break
        */

        if(strs.size == 1) return strs[0]
        
        var min = 999
        var output = ""
        for(i in strs){
            min = if (min > i.length) i.length else min
        }

        for(i in min downTo 0){
            var count = 0
            val word = strs[0].substring(0, i)
            for (s in strs)  {
                if(word == s.substring(0, i)) count++  
            }
            if(count == strs.size) {
                output = word
                break
                }
        }

        return output
    }
}