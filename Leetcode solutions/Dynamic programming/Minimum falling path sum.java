class Solution {
    public int mfp(int i,int j,int [][]dp,int [][]matrix){
        if(j<0 || j>=matrix.length)     return Integer.MAX_VALUE;
        if(i==0)   return matrix[i][j];
        if(dp[i][j]!=Integer.MAX_VALUE)
            return dp[i][j];
        return dp[i][j]=matrix[i][j]+Math.min(mfp(i-1,j-1,dp,matrix),Math.min(mfp(i-1,j,dp,matrix),mfp(i-1,j+1,dp,matrix)));

    }
    public int minFallingPathSum(int[][] matrix) {
        int ans=Integer.MAX_VALUE;
        int n=matrix.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++)
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        // for(int )
        for(int i=0;i<n;i++){
            ans=Math.min(ans,mfp(n-1,i,dp,matrix));
        }
    return ans;
    }
}