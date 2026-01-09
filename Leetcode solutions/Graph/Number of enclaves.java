class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        Queue<int []>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            if(grid[i][0]==1){
                q.add(new int[]{i,0});
                grid[i][0]=2;
                }
            if(grid[i][n-1]==1){
                q.add(new int[]{i,n-1});
                grid[i][n-1]=2;
            }
        }
        for(int i=0;i<n;i++){
            if(grid[0][i]==1){
                q.add(new int[]{0,i});
                grid[0][i]=2;
            }
            if(grid[m-1][i]==1){
                q.add(new int[]{m-1,i});
                grid[m-1][i]=2;
            }
        }
        int x[]={-1,0,1,0};
        int y[]={0,-1,0,1};
        while(!q.isEmpty()){
            int [] val=q.poll();
            int i=val[0],j=val[1];
            for(int k=0;k<4;k++){
                int r=x[k]+i,c=y[k]+j;
                if(r>=0 && c>=0 && r<m && c<n && grid[r][c]==1){
                    q.add(new int[]{r,c});
                    grid[r][c]=2;
                }
            }
        }
    int c=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==1)
                c++;
            }
        }
    return c;
    }
    
}