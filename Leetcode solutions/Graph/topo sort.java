class Solution {
    int i=0;
    public void dfs(ArrayList<ArrayList<Integer>>adj,ArrayList<Integer>li,boolean vis [],int nd){
        vis[nd]=true;
        for(int val:adj.get(nd)){
            if(!vis[val])
                dfs(adj,li,vis,val);
        }
        li.set(i--,nd);
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        this.i=V-1;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>(V);
        ArrayList<Integer>li=new ArrayList<>(V);
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
            li.add(0);
        }
        for(int e[]:edges)
            adj.get(e[0]).add(e[1]);
        boolean vis[]=new boolean[V];
        for(int nd=0;nd<V;nd++){
            if(!vis[nd])
                dfs(adj,li,vis,nd);}
        return li;
        
    }
}