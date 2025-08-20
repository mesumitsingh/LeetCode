class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length; 
        int n = matrix[0].length; 
        int subMatrix = 0; 

        int[][] maximal_sq = new int[m+1][n+1];
        
        for(int i=1; i<=m; i++) { 
            for(int j=1; j<=n; j++) { 
                if(matrix[i-1][j-1] == 1) { 
                    maximal_sq[i][j] = 1 + Math.min(maximal_sq[i][j-1], Math.min(maximal_sq[i-1][j], maximal_sq[i-1][j-1]));
                    subMatrix += maximal_sq[i][j];
                }
            }
        }
        return subMatrix;
    }
}