class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int j=0, m=matrix.length, n=matrix[0].length; 
        for(int i=0; i<m; i++) {
            while(j<n) { 
                if(target < matrix[i][j++]) continue;
            }
            for(int k=0; k<n; k++) { 
                if(matrix[i][k]==target) { 
                    return true; 
                }
            }
        }
        
        return false; 
    }
}