class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        List<List<int []>>adj=new ArrayList<>();
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{0,0});
        int sum=0;
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int e[]:edges){
            adj.get(e[0]).add(new int[]{e[1],e[2]});
            adj.get(e[1]).add(new int[]{e[0],e[2]});
        }
        int vis[]=new int[V];
        Arrays.fill(vis,-1);
        while(!pq.isEmpty()){
            int a[]=pq.poll();
            int nd=a[0];
            int wt=a[1];
            if(vis[nd]==1)
                continue;
            else
                sum+=wt;
            vis[nd]=1;
            for(int nei[]:adj.get(nd)){
                if(vis[nei[0]]==-1)
                    pq.add(new int[]{nei[0],nei[1]});
            }
        }
    return sum;
    }
}
