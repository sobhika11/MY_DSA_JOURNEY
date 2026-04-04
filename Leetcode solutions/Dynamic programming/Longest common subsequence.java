import java.util.Arrays;

class Solution {
    public static int LCS(String s1,String s2,int i,int j,int dp[][]){
        if(i==-1 || j==-1)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
            return dp[i][j]= 1+LCS(s1,s2,i-1,j-1,dp);
        return dp[i][j]=Math.max(LCS(s1,s2,i,j-1,dp),LCS(s1,s2,i-1,j,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int dp[][]=new int[n1][n2];
        for(int i=0;i<n1;i++)
            Arrays.fill(dp[i],-1);
        return LCS(text1,text2,n1-1,n2-1,dp);
    }
}