class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n = boxGrid.length; 
        int m = boxGrid[0].length;
        for(int i=0; i<n; i++) { 
            
            int k=m-1; 

            for(int j=m-1; j>=0; j--) { 
                if(boxGrid[i][j]=='*') { 
                    k = j-1; 
                } else if (boxGrid[i][j] == '#'){ 
                    char temp = boxGrid[i][j]; 
                    boxGrid[i][j] = boxGrid[i][k]; 
                    boxGrid[i][k] = temp; 

                    k--; 
                }
            }
        }

        char[][] grid = new char[m][n]; 
        for(int i=0; i<n; i++) { 
            for(int j=0; j<m; j++) { 
                grid[j][n-1-i] = boxGrid[i][j]; 
            }
        }

        return grid; 
    }
}