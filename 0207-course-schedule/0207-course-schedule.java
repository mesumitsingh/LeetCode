class Solution {

    public boolean isCycle(int[][] prerequisites, int src, boolean[] visited, boolean[] parent) {
        visited[src] = true;
        parent[src] = true;

        for (int i = 0; i < prerequisites.length; i++) {
            int v = prerequisites[i][0];
            int u = prerequisites[i][1];

            if (u == src) {
                if (!visited[v]) {
                    if (isCycle(prerequisites, v, visited, parent)) {
                        return true;
                    }
                } else if (parent[v]) {
                    return true;
                }
            }
        }

        parent[src] = false;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[numCourses];
        boolean[] parent = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (isCycle(prerequisites, i, visited, parent)) {
                    return false;
                }
            }
        }

        return true;

    }
}