class Solution {

    public static boolean isCycleDirected(boolean[] vis, boolean[] stack, int[][] edges, int src) {
        vis[src] = true;
        stack[src] = true;

        for (int i = 0; i < edges.length; i++) {
            int v = edges[i][0];
            int u = edges[i][1];

            if (u == src) {
                if (!vis[v]) {
                    if (isCycleDirected(vis, stack, edges, v)) {
                        return true;
                    }
                } else if (stack[v]) {
                    return true;
                }
            }
        }

        stack[src] = false;
        return false;

    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        boolean[] vis = new boolean[numCourses];
        boolean[] stack = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                if (isCycleDirected(vis, stack, prerequisites, i)) {
                    return false;
                }
            }
        }

        return true;

    }
}