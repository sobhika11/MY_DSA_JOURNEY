import java.util.*;
class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int [] visited=new int[adj.size()];
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        visited[0]=1;
        while(!q.isEmpty()){
            int ch=q.poll();
            ans.add(ch);
            for(int c:adj.get(ch))
                {
                    if(visited[c]!=1)
                        q.add(c);
                        visited[c]=1;
                }
        }
        return ans;
        
    }
}