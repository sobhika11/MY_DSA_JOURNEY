class Solution {
    public static int cost(int n,int [] h,int k,int dp[]){
        if(n==0){
            dp[n]=0;
            return dp[n];
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(n-i>=0){
                int co=(dp[n-i]==-1)?cost(n-i,h,k,dp)+Math.abs(h[n]-h[n-i]):dp[n-i]+Math.abs(h[n]-h[n-i]);
                min=Math.min(min,co);
                dp[n]=min;
            }
            
        }
        return min;

    }
    public int frogJump(int[] heights, int k) {
        int n=heights.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        cost(n-1,heights,k,dp);
        return dp[n-1];
    }
}