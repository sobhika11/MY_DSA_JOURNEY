class Solution {
    public int knap(int val[],int wt[],int cap,int i,int [][]dp){
        if(i<0 || cap<=0)
            return 0;
        if(dp[i][cap]!=-1)
            return dp[i][cap];
        int pick = 0;
        if (wt[i]<=cap) 
            pick=val[i]+knap(val,wt,cap-wt[i],i,dp);
        int not_pick=knap(val,wt,cap,i-1,dp);
        return dp[i][cap]=Math.max(pick,not_pick);
    }
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n=val.length;
        int dp[][]=new int[n][capacity+1];
        for(int i=wt[0];i<=capacity;i++)    
            dp[0][i]=i/wt[0]*(val[0]);
        for(int i=1;i<n;i++){
            for(int j=1;j<=capacity;j++){
                int pick=0;
                if(j-wt[i]>=0)
                    pick=val[i] +dp[i][j-wt[i]];
                int not=dp[i-1][j];
                dp[i][j]=Math.max(pick,not);
            }
        }
        return dp[n-1][capacity];
        // return knap(val,wt,capacity,n-1,dp);
        
    }
}