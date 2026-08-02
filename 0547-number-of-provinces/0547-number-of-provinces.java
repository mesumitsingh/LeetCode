class Solution {

    public void dfs(boolean[] vis, int[][] graph, int i) { 
        vis[i] = true; 

        for(int j=0; j<graph.length; j++) { 
            if(graph[i][j] == 1 && !vis[j]) { 
                dfs(vis, graph, j);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int ans =0; 

        int n = isConnected.length; 
        boolean[] vis = new boolean[n]; 

        for(int i=0; i<n; i++) { 
            if(!vis[i]) { 
                dfs(vis, isConnected, i); 
                ans++; 
            }
        }
        return ans; 
    }
}