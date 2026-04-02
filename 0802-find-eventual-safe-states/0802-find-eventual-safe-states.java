class Solution {
    public static boolean isCycle(int[][] graph, boolean[] vis, boolean[] recstack, int curr) { 
        vis[curr] = true; 
        recstack[curr] = true; 

        for(int v : graph[curr]) { 
            if(!vis[v]) { 
                if(isCycle(graph, vis, recstack, v)) { 
                    return true; 
                }
            } else if(recstack[v]) { 
                return true;
            }
        }

        recstack[curr] = false; 
        return false; 
    }

    public static List<Integer> eventualSafeNodes(int[][] graph) {
        boolean[] vis = new boolean[graph.length];
        boolean[] recstack = new boolean[graph.length];

        
        for(int i=0; i<graph.length; i++) { 
            if(!vis[i]) { 
                isCycle(graph, vis, recstack, i);
            }
        }

        List<Integer> safeNodes = new ArrayList<>();
        for(int i=0; i<recstack.length; i++) { 
            if(!recstack[i]) { 
                safeNodes.add(i);
            }
        }

        return safeNodes;
    } 
}