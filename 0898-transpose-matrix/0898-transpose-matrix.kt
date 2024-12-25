class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        /*
            row of new -> column of old
         */

         val col = matrix[0].size
         val row = matrix.size

         return Array(col){j ->
            IntArray(row){i ->
                matrix[i][j]
            }
         }
    }
}