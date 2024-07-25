class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<ArrayList<Integer>, Integer> hash = new HashMap<>(); 

        for(int i=0; i<grid.length; i++){
            ArrayList<Integer> rows = new ArrayList<Integer>(); 

            for(int j=0; j<grid[0].length; j++){
                rows.add(grid[i][j]); 
            }

            hash.put(rows, hash.getOrDefault(rows,0)+1);
        }

        int count=0; 
        for(int j=0; j<grid[0].length; j++){
        ArrayList<Integer> columns = new ArrayList<Integer>(); 

        for(int i=0; i<grid.length; i++){
            columns.add(grid[i][j]); 
        }

        if(hash.containsKey(columns)){
            count = count+hash.get(columns); 
        }
    }

    return count;  
 
    }
}