class Solution {
    fun modifiedMatrix(matrix: Array<IntArray>): Array<IntArray> {
        
        val mSize = matrix.size
        if (mSize < 2) return matrix
        
        val cols = matrix[0].size
        val row = matrix.size
        var lar = 0
        for(i in 0..cols-1){
            lar = 0
            for(j in 0..row-1){
                if(lar < matrix[j][i]) lar = matrix[j][i]
            }
            for(j in 0..row-1){
                if(matrix[j][i] == -1) matrix[j][i] = lar
            }
        }
        
        return matrix
    }
}