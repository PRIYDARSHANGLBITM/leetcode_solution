class Solution {
    public int minCost(int n, int[][] edges) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] e : edges){
            int u = e[0];
            int v = e[1];
            int w = e[2];

            graph.get(u).add(new int[]{v, w});      
            graph.get(v).add(new int[]{u, 2 * w});   
        }
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        PriorityQueue<long[]> pq =
            new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        pq.add(new long[]{0, 0}); 
        while(!pq.isEmpty()){
            long[] curr = pq.poll();
            long cost = curr[0];
            int node = (int) curr[1];
            if(cost > dist[node]) continue;
            for(int[] nei : graph.get(node)){
                int nextNode = nei[0];
                long wt = nei[1];
                if(cost + wt < dist[nextNode]){
                    dist[nextNode] = cost + wt;
                    pq.add(new long[]{dist[nextNode], nextNode});
                }
            }
        }
        return dist[n-1] == Long.MAX_VALUE ? -1 : (int)dist[n-1];
    }
}
