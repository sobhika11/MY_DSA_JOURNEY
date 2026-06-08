class Solution {
    public int LCS(String s,String k,int i,int j,int dp[][]){
        if(i==s.length() || j==s.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s.charAt(i)==k.charAt(j))
            return dp[i][j]=1+LCS(s,k,i+1,j+1,dp);
        else
            return dp[i][j]=Math.max(LCS(s,k,i,j+1,dp),LCS(s,k,i+1,j,dp));
    }
    public int minInsertions(String s) {
        int n=s.length();
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<n;i++)
            Arrays.fill(dp[i],-1);
        String k=new StringBuilder(s).reverse().toString();
        return s.length()-LCS(s,k,0,0,dp);
    }
}