class Solution {
    class Pair{
        int nd;
        int w;
        public Pair(int a,int b){
            nd=a;
            w=b;
        }
    }
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int e[]:edges){
            adj.get(e[0]).add(new Pair(e[1],e[2]));
            adj.get(e[1]).add(new Pair(e[0],e[2]));
        }
        PriorityQueue<Pair>q=new PriorityQueue<>((a,b)->a.w-b.w);
        int dist[]=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        q.add(new Pair(src,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            for(Pair nei:adj.get(p.nd)){
                if(dist[nei.nd]>nei.w+dist[p.nd]){
                    dist[nei.nd]=nei.w+dist[p.nd];
                    q.add(new Pair(nei.nd,dist[nei.nd]));
                }
            }
        }
    return dist;
        
    }
}