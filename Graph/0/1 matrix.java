class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int vis[][]=new int[m][n];
        int [][]res=new int[m][n];
        Queue<int []>q=new LinkedList<>();
        for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++){
                    if(mat[i][j]==0){
                        q.add(new int[]{i,j,0});
                        vis[i][j]=1;}
                }
            }
        int x[]={-1,0,1,0};
        int y[]={0,-1,0,1};
        while(!q.isEmpty()){
            int []val=q.poll();
            int i=val[0],j=val[1],d=val[2];
            res[i][j]=d;
            for(int k=0;k<4;k++){
                int r=x[k]+i,c=y[k]+j;
                if(r>=0 && c>=0 && r<m && c<n && vis[r][c]==0){
                    q.add(new int[]{r,c,d+1});
                    vis[r][c]=1;}
            }
            
        }

    return res;
    }
}