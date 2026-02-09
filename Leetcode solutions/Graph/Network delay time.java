class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int []>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++)
            adj.add(new ArrayList<>());
        for(int e[]:times)
            adj.get(e[0]).add(new int[]{e[1],e[2]});
        PriorityQueue<int []>q=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int dist[]=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        q.add(new int[]{k,0});
        while(!q.isEmpty()){
            int a[]=q.poll();
            int d=a[1];
            int nd=a[0];
            for(int nei[]:adj.get(nd)){
                int ndis=nei[1]+d;
                if(dist[nei[0]]>ndis){
                    dist[nei[0]]=ndis;
                    q.add(new int[]{nei[0],ndis});
                }
            }
        }
    int max=0;
    for(int i=1;i<=n;i++){
    if(dist[i]==Integer.MAX_VALUE)  
        return -1;
    max=Math.max(dist[i],max);
    }
    return max;
    }
    
}