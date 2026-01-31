class Pair{
    int r,c;
    Pair(int i,int j)
    {
        r=i;
        c=j;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
    Queue<Pair>q=new LinkedList<>();
    int ans=1,n=grid.length;
    if(grid[0][0]==1)
            return -1;
    q.offer(new Pair(0,0));
    int row[]={-1,0,1,0,-1,-1,1,1};
    int col[]={0,1,0,-1,-1,1,1,-1};
    while(!q.isEmpty())
        {
           
            int size = q.size();
            for (int j = 0; j < size; j++) {
                 Pair v=q.poll();
            if(v.r==n-1 && v.c==n-1)
                return ans;
            for(int i=0;i<8;i++)
                {
                    int r=row[i]+v.r;
                    int c=col[i]+v.c;
                    if(c>=0 && r>=0 && r<n && c<n && grid[r][c]==0 && grid[r][c]!=2)
                    {
                        q.offer(new Pair(r,c));
                        grid[r][c]=2;
                    }
                }
            }
        
                        ans++;
        }
    return -1;
    }
}