public class Solution {
    public int findpar(int par[],int x){
        if(par[x]==x)
            return x;
        int v=findpar(par,par[x]);
        par[x]=v;
        return v;
    }
    public void union(int []rank,int u,int v,int []par){
        int upu=findpar(par,u);
        int upv=findpar(par,v);
        if(rank[upu]>rank[upv])
            par[upv]=upu;
        else if(rank[upv]>rank[upu])
            par[upu]=upv;
        else{
            rank[upu]++;
            par[upv]=upu;
        }
        
    }
    public int minConnect(int V, int[][] edges) {
        // code here
        if(edges.length<V-1)
            return -1;
        int rank[]=new int[V];
        int par[]=new int[V];
        for(int i=0;i<V;i++)
            par[i]=i;
        for(int []e:edges)
            union(rank,e[0],e[1],par);
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<V;i++)
           set.add(findpar(par,i));
        return set.size()-1;
        
    }
}
