class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>(); 
        int repeat=0; 
        int n = grid.length;
        int[] arr = new int[n*n+1];

        for(int i=0; i<grid.length; i++) { 
            for(int j=0; j<grid.length; j++) { 
                if(set.contains(grid[i][j])) { 
                    repeat = grid[i][j];
                }
                set.add(grid[i][j]);
     
                arr[grid[i][j]]++;
            }
        }

        int missing =0; 

        for(int i=1; i<arr.length; i++) { 
            if(arr[i] ==0) {
                missing = i;
            }
        }

        return new int[] {repeat, missing};
    }
}