import java.util.*;
class Solution {
    public void bfs(int [][] mat,boolean [] vis,int i){
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        vis[i]=true;
        while(!q.isEmpty()){
            int v=q.poll();
            for(int j=0;j<mat.length;j++)
                {
                    if(mat[v][j]==1 && !vis[j]){
                        q.add(j);
                        vis[j]=true;}
                        
                }
        }

    }
    public int findCircleNum(int[][] isConnected) {
        boolean vis[]=new boolean[isConnected.length+1];
        int c=0;
        for(int i=0;i<isConnected.length;i++)
        {
            if(!vis[i]){
                bfs(isConnected,vis,i);
                c++;
            }
        }
    return c;
        

    }
}