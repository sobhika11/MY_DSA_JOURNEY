class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int []>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int e[]:flights)
            adj.get(e[0]).add(new int[]{e[1],e[2]});
        Queue<int []>q=new LinkedList<>();
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        q.add(new int[]{src,0,0});
        while(!q.isEmpty()){
            int a[]=q.poll();
            int ki=a[2];
            int co=a[1];
            int nd=a[0];
            if(ki>k)
                break;
            for(int nei[]:adj.get(nd)){
                if(dst==nei[0] && ki<=k)
                    dist[dst]=Math.min(co+nei[1],dist[nei[0]]);
                int nco=co+nei[1];
                if(dist[nei[0]]>nco){
                    dist[nei[0]]=nco;
                    q.add(new int[]{nei[0],nco,ki+1});
                }
            }
        } 
    if(dist[dst]==Integer.MAX_VALUE)    return -1;
    return dist[dst];
    }
}