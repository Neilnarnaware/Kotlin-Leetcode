class Solution {
    fun isPathCrossing(path: String): Boolean {
        /*
            (x, y)
            N -> x + 1
            S -> x - 1
            E -> y + 1
            W -> y -1
         */
        if(path.length == 1) return false

        val directionSet = HashSet<String>() 
        directionSet.add(0.toString() +"~"+0.toString())

        var leftOrRight = 0
        var upOrDown = 0
        for(i in path){
            when(i){
                'N'-> upOrDown += 1
                'S'-> upOrDown -= 1
                'E'-> leftOrRight += 1
                'W'-> leftOrRight -= 1
            }
            val coordinate = upOrDown.toString() +"~"+leftOrRight.toString()
            if(directionSet.contains(coordinate)) return true
            else directionSet.add(coordinate)
        }
        return false
    }
}