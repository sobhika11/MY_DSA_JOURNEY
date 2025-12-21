class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>>adj,boolean []vis,int v,int pt){
        vis[v]=true;
        for(int ch:adj.get(v)){
            if(!vis[ch]){
                if(dfs(adj,vis,ch,v))
                    return true;
            }
            else if(pt!=ch)
                return true;
        }
    return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        // Code here
    ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
    for(int i=0;i<V;i++)
        adj.add(new ArrayList<>());
    for(int []e:edges)
    {
        adj.get(e[0]).add(e[1]);
        adj.get(e[1]).add(e[0]);
    }
    boolean vis[]=new boolean[V];
    for(int i=0;i<V;i++){
        if(!vis[i]){
             if(dfs(adj,vis,i,-1))
                return true;
            }
        }
    return false;
    
    }
}