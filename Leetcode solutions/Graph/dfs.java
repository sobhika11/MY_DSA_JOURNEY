import java.util.*;
class Solution {
    ArrayList<Integer>ans=new ArrayList<>();
    public void dfs(boolean vis[],int i,ArrayList<ArrayList<Integer>> adj){
        vis[i]=true;
        ans.add(i);
        for(int v:adj.get(i))
        {
            if(!vis[v])
                dfs(vis,v,adj);
        }
        
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean vis[]=new boolean[adj.size()];
        dfs(vis,0,adj);
        return ans;
        
    }
}