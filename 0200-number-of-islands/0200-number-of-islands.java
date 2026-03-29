class Solution {

    public void dfs(int i, int j, boolean[][] visited, char[][] grid, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1' || visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        dfs(i - 1, j, visited, grid, n, m); // top 
        dfs(i + 1, j, visited, grid, n, m); // bottom 
        dfs(i, j - 1, visited, grid, n, m); // left
        dfs(i, j + 1, visited, grid, n, m); // right
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int island = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(i, j, visited, grid, n, m);
                    island++;
                }
            }
        }

        return island;
    }
}