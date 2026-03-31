class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length,m=heights[0].length;
        int diff[][]=new int [n][m];
        for(int i=0;i<n;i++)
            Arrays.fill(diff[i],Integer.MAX_VALUE);
        diff[0][0]=0;
        PriorityQueue<int []>q=new PriorityQueue<>((a,b)->a[0]-b[0]);
        q.add(new int[]{0,0,0});
        int row[]={-1,0,1,0};
        int col[]={0,-1,0,1};
        while(!q.isEmpty()){
            int a[]=q.poll();
            int d=a[0],r=a[1],c=a[2];
            for(int i=0;i<4;i++){
                int newr=r+row[i],newc=c+col[i];
                if(newr>=0 && newr<n && newc>=0 && newc<m){
                    int nd=Math.max(Math.abs(heights[r][c]-heights[newr][newc]),d);
                    if(nd<diff[newr][newc]){
                        diff[newr][newc]=nd;
                        q.add(new int[]{nd,newr,newc});
                    }
                }
            }
        }
        return diff[n-1][m-1];        
    }
}