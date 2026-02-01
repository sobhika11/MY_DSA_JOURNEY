public // User function Template for Java
class Solution {
    class Pair{
        int e;
        int w;
        Pair(int e,int w){
            this.e=e;
            this.w=w;
        }
    }
    ArrayList<Integer>topo=new ArrayList<>();
    public void topo_sort(ArrayList<ArrayList<Pair>>adj,int V,int [] ind){
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<ind.length;i++){
            if(ind[i]==0)
                q.add(i);
        }
        while(!q.isEmpty()){
            int nd=q.poll();
            topo.add(nd);
            for(Pair nei:adj.get(nd)){
                ind[nei.e]--;
                if(ind[nei.e]==0)
                    q.add(nei.e);
            }
        }
        
    }
    public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        int ind[]=new int[V];
        for(int i=0;i<V;i++)    
            adj.add(new ArrayList<>());
        for(int e[]:edges){
            adj.get(e[0]).add(new Pair(e[1],e[2]));
            ind[e[1]]++;
        }
        int dist[]=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        topo_sort(adj,V,ind);
        for(int nd:topo){
             if(dist[nd]==Integer.MAX_VALUE)
                    continue;
            for(Pair p:adj.get(nd))
            {
               dist[p.e]=Math.min(dist[p.e],p.w+dist[nd]);
            }
        }
        for(int i=0;i<dist.length;i++)
        {
            if(dist[i]==Integer.MAX_VALUE)
                dist[i]=-1;
        }
    return dist;
    }
} {
    
}
