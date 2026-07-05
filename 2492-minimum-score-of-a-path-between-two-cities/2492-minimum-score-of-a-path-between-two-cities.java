class Solution {

    static class Edge {
        int wt;
        int dest;

        Edge(int wt, int dest) {
            this.wt = wt;
            this.dest = dest;
        }
    }

    int ans = Integer.MAX_VALUE;

    public void dfs(ArrayList<Edge> graph[], int curr, boolean[] visited) {
        if (!visited[curr]) {
            visited[curr] = true;

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);

                ans = Math.min(ans, e.wt);

                dfs(graph, e.dest, visited);
            }
        }
    }

    public int minScore(int n, int[][] roads) {
        ArrayList<Edge> graph[] = new ArrayList[n + 1];
        boolean[] visited = new boolean[n + 1];

        for (int i = 1; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] road : roads) {
            int src = road[0];
            int dest = road[1];
            int wt = road[2];

            graph[src].add(new Edge(wt, dest));
            graph[dest].add(new Edge(wt, src));
        }

        dfs(graph, 1, visited);

        return ans;

    }
}