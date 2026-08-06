class Solution {

    class Pair implements Comparable<Pair> {
        int node;
        int dist;

        Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair b) {
            return Integer.compare(this.dist, b.dist);
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {

        PriorityQueue<Pair> q = new PriorityQueue<>();
        int[] dist = new int[n + 1];
        
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0; 

        q.add(new Pair(k,0)); 

        while(!q.isEmpty()) { 
            Pair curr = q.poll(); 

            if(curr.dist > dist[curr.node]) { 
                continue;
            }

            for(int[] t : times) { 
                int u = t[0]; 
                int v = t[1]; 
                int wt = t[2];

                if(u == curr.node && dist[v] > dist[u] + wt) { 
                    dist[v] = dist[u] + wt; 
                    q.add(new Pair(v, dist[v]));
                }
            }
        }

        int ans = -1;
        for(int i=1; i<=n; i++) { 
            ans = Math.max(dist[i], ans); 
        }

        if(ans == Integer.MAX_VALUE) { 
            return -1; 
        }

        return ans;

    }
}
