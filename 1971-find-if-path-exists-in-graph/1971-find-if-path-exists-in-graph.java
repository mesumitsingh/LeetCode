class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            adjList.get(from).add(to);
            adjList.get(to).add(from);
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        visited[source] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();

            if (curr == destination) {
                return true;
            }

            for (int i=0; i<adjList.get(curr).size(); i++) {
                int neighbor = adjList.get(curr).get(i);
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }

        return false;
    }
}
