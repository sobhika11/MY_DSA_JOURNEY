class Solution {
    public static int maxCut(int [] p,int i,int n,int [][] dp){
        if(i==0)
            return p[0]*n;
        if(dp[i][n]!=0)
            return dp[i][n];
        int pick=0;
        if(i+1<=n)
            pick = p[i]+maxCut(p,i,n-(i+1),dp);
        int not=maxCut(p,i-1,n,dp);
        return dp[i][n]=Math.max(pick,not);
    }
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int dp[][]=new int[n][n+1];
        for(int i=0;i<=n;i++)
            dp[0][i]=price[0]*i;
        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
               int pick=0;
               if((i+1)<=j)
                    pick=price[i]+dp[i][j-(i+1)];
                int not=dp[i-1][j];
                dp[i][j]=Math.max(pick,not);
            }
        }
        // return maxCut(price,n-1,n,dp);
        return dp[n-1][n];
    }
}