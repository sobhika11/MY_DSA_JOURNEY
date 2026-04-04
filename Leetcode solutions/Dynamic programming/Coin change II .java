import java.util.Arrays;

class Solution {
    public int coins(int amt,int [] coins,int i,int [][]dp){
        if(amt==0)
            return 1;
        if(amt<0)
            return 0;
        if(dp[i][amt]!=-1)  return dp[i][amt];
        int ans=0;
        for(int j=i;j<coins.length;j++)
            ans+=coins(amt-coins[j],coins,j,dp);
        return dp[i][amt]=ans;
    }
    public int change(int amount, int[] coins) {
        // return coins(amount,coins,0);
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<n;i++)
            Arrays.fill(dp[i],-1);
        return coins(amount,coins,0,dp);
    }
}