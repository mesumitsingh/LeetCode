class Solution {

    public void mark(int i, int j, boolean[][] arr, int oi, int oj, int[][] heights) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j]
                || (oi >= 0 && oj >= 0 && heights[oi][oj] > heights[i][j])) {
            return;
        }

        arr[i][j] = true;

        mark(i + 1, j, arr, i, j, heights);
        mark(i - 1, j, arr, i, j, heights);
        mark(i, j + 1, arr, i, j, heights);
        mark(i, j - 1, arr, i, j, heights);
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            mark(i, 0, pacific, -1, -1, heights);
            mark(i, m - 1, atlantic, -1, -1, heights);
        }

        for (int i = 0; i < m; i++) {
            mark(0, i, pacific, -1, -1, heights);
            mark(n - 1, i, atlantic, -1, -1, heights);
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    result.add(list);
                }
            }
        }

        return result;

    }
}