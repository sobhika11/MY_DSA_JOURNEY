class Solution {
    // s1+s2=target;

    public static int recur(int nums[],int i,int t){
        if(t==0)
            return 1;
        
    }
    public static int count(int nums[],int n,int t,int [][] dp){
        if(n==0){
           if(t==0 && nums[0]==t)
                return 2;
            if(t==0 || nums[0]==t)
                return 1;
            return 0;
        }
        if(dp[n][t]!=-1)
            return dp[n][t];
        int pick=0;
        if(nums[n]<=t)
            pick=count(nums,n-1,t-nums[n],dp);
        int not_pick=count(nums,n-1,t,dp);
        return dp[n][t]=pick+not_pick;
            
    }
    public int findTargetSumWays(int[] nums, int target) {
        int ts=0,n=nums.length;
        for(int i:nums)
            ts+=i;
        if(ts<Math.abs(target))
            return 0;
        int t=(ts+Math.abs(target));
        if(t%2==1)
            return 0;
        t=t/2;
        int dp[][]=new int[n][t+1];
        for(int i=0;i<n;i++)
            Arrays.fill(dp[i],-1);
        return count(nums,n-1,t,dp);
    }
}