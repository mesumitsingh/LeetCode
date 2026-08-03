class Solution {

    public boolean isCycleDFS(int curr, int[][] edges, boolean[] vis, boolean[] recPath) {
        vis[curr] = true;
        recPath[curr] = true;

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][1];
            int v = edges[i][0];

            if (u == curr) {
                if (!vis[v]) {
                    if (isCycleDFS(v, edges, vis, recPath)) {
                        return true;
                    }

                } else if (recPath[v]) {
                    return true;
                }

            }
        }
        recPath[curr] = false; 
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        boolean[] vis = new boolean[numCourses];
        boolean[] recPath = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                if (isCycleDFS(i, prerequisites, vis, recPath)) {
                    return false;
                }
            }
        }

        return true;
    }
}