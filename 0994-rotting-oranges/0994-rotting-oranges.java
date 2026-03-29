class Solution {
    class Pair {
        int first;
        int second;

        Pair(int x, int y) {
            this.first = x;
            this.second = y;
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
        int ans = 0;

        boolean[][] visited = new boolean[n][m];
        Queue<Node> q = new LinkedList<>(); //((i, j), time)

        // pushing all sources in queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Node(new Pair(i, j), 0));
                    visited[i][j] = true; 
                }
            }
        }

        // bfs
        while (q.size() > 0) {
            int i = q.peek().p.first;
            int j = q.peek().p.second;
            int time = q.peek().t;
            q.poll();

            ans = Math.max(ans, time);

            if (i - 1 >= 0 && !visited[i - 1][j] && grid[i - 1][j] == 1) { // top  
                q.add(new Node(new Pair(i - 1, j), time + 1));
                visited[i - 1][j] = true;
            }

            if (i + 1 < n && !visited[i + 1][j] && grid[i + 1][j] == 1) { // botoom  
                q.add(new Node(new Pair(i + 1, j), time + 1));
                visited[i + 1][j] = true;
            }

            if (j - 1 >= 0 && !visited[i][j - 1] && grid[i][j - 1] == 1) { // left  
                q.add(new Node(new Pair(i, j - 1), time + 1));
                visited[i][j - 1] = true;
            }

            if (j + 1 < m && !visited[i][j + 1] && grid[i][j + 1] == 1) { // right 
                q.add(new Node(new Pair(i, j + 1), time + 1));
                visited[i][j + 1] = true;
            }
        }

        // check if fresh left 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && ! visited[i][j]) {
                    return -1;
                }
            }
        }

        return ans;

    }
}