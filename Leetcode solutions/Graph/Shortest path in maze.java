// User function Template for Java

class Solution {

    int shortestPath(int[][] grid, int[] source, int[] destination) {

        // Your code here
        if(source[0]==destination[0] && source[1]==destination[1])
            return 0;
        int n=grid.length,m=grid[0].length;
        int [][] dist=new int[n][m];
        for(int i=0;i<n;i++)
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        dist[source[0]][source[1]]=0;
        Queue<int []> q=new LinkedList<>();
        int row[]={0,-1,0,1};
        int col[]={-1,0,1,0};
        q.add(new int[]{source[0],source[1],0});
        while(!q.isEmpty()){
            int [] nd=q.poll();
            int r=nd[0],c=nd[1],d=nd[2];
            for(int i=0;i<4;i++){
                int newr=r+row[i],newc=c+col[i];
                if(newr>=0 && newr<n && newc>=0 && newc<m && newr==destination[0] && grid[newr][newc]==1 && newc==destination[1])
                    return d+1;
                if(newr>=0 && newr<n && newc>=0 && newc<m && grid[newr][newc]==1 && d+1<dist[newr][newc]){
                    dist[newr][newc]=d+1;
                    q.add(new int[]{newr,newc,d+1});
                }
            }
        }
        return -1;
        
    }
}
