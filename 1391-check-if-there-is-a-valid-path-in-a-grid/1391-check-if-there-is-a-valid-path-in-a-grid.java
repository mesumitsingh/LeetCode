class Solution {
    public int n;
    public int m;

    Map<Integer, List<int[]>> directions = new HashMap<>();
    {
        directions.put(1, Arrays.asList(
                new int[] { 0, -1 },
                new int[] { 0, 1 }));

        directions.put(2, Arrays.asList(
                new int[] { -1, 0 },
                new int[] { 1, 0 }));

        directions.put(3, Arrays.asList(
                new int[] { 0, -1 },
                new int[] { 1, 0 }));

        directions.put(4, Arrays.asList(
                new int[] { 0, 1 },
                new int[] { 1, 0 }));

        directions.put(5, Arrays.asList(
                new int[] { -1, 0 },
                new int[] { 0, -1 }));

        directions.put(6, Arrays.asList(
                new int[] { -1, 0 },
                new int[] { 0, 1 }));
    }

    public boolean dfs(int[][] grid, int i, int j,boolean[][] visited ) { 
        if(i==n-1 && j== m-1) { 
            return true;
        }

        visited[i][j] = true; 

        for(int[] dir : directions.get(grid[i][j])) { 
            int new_i = i + dir[0];
            int new_j = j + dir[1];

            if(new_i >= n || new_j >=m || new_i < 0 || new_j < 0 || visited[new_i][new_j]) { 
                continue;
            }

            for(int[] backDir : directions.get(grid[new_i][new_j])) { 
                if(new_i + backDir[0] == i 
                    && new_j + backDir[1] == j) { 
                        if(dfs(grid, new_i, new_j, visited)) { 
                            return true; 
                        }
                    }
            }
        }

        return false; 

    }

    public boolean hasValidPath(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        return dfs(grid, 0, 0, visited);

    }
}