class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeating = -1, missing = -1;
        int col, row, curr;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; ++j) {
                curr = Math.abs(grid[i][j]);
                row = (curr - 1) / n;
                col = (curr - 1) % n;
                if (grid[row][col] < 0) {
                    repeating = curr;
                } else {
                    grid[row][col] *= -1;
                }
            }
        }

        for(int i=0; i<n; i++){ 
            for(int j=0; j<n; j++){ 
                if(grid[i][j]>0){ 
                    missing = (i*n) + (j+1); 
                }
            }
        }

        return new int[] { repeating, missing };
    }
}