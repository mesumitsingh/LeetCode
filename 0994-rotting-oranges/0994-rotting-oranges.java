class Solution {

    class Pair {
        int a;
        int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    class Node {
        Pair p;
        int t;

        Node(Pair p, int t) {
            this.p = p;
            this.t = t;
        }
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int t = 0;
        boolean[][] vis = new boolean[n][m];

        Queue<Node> q = new LinkedList<>();

        // push all rotten to queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Node(new Pair(i, j), 0));
                    vis[i][j] = true;
                }
            }
        }

        int ans = 0;

        // bfs
        while (!q.isEmpty()) {
            int i = q.peek().p.a;
            int j = q.peek().p.b;
            int time = q.peek().t;
            q.poll();

            ans = Math.max(ans, time);

            if (i - 1 >= 0 && !vis[i - 1][j] && grid[i - 1][j] == 1) {
                q.add(new Node(new Pair(i - 1, j), time + 1));
                vis[i - 1][j] = true;
            }

            if (i + 1 < n && !vis[i + 1][j] && grid[i + 1][j] == 1) {
                q.add(new Node(new Pair(i + 1, j), time + 1));
                vis[i + 1][j] = true;
            }

            if (j - 1 >= 0 && !vis[i][j - 1] && grid[i][j - 1] == 1) {
                q.add(new Node(new Pair(i, j - 1), time + 1));
                vis[i][j - 1] = true;
            }

            if (j + 1 < m && !vis[i][j + 1] && grid[i][j + 1] == 1) {
                q.add(new Node(new Pair(i, j + 1), time + 1));
                vis[i][j + 1] = true;
            }

        }

        // check if all are rotten
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    return -1;
                }
            }
        }

        return ans;

    }
}