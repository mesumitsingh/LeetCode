class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;
        int[] list = new int[n * m];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list[k++] = grid[i][j];
            }
        }

        Arrays.sort(list);
        int tar = list[(n * m / 2)];
        int res = 0;

        for (int i = 0; i < list.length; i++) {
            int steps = 0;
            if ((tar - list[i]) % x == 0) {
                while (list[i] != tar) {

                    if (list[i] < tar) {
                        list[i] += x;
                        steps++;
                    } else {
                        list[i] -= x;
                        steps++;
                    }

                }
                res += steps;
            } else {
                return -1;
            }
        }

        return res;
    }
}