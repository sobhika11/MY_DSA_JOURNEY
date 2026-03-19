public class Solution {
    public static void LCS(String s1,String s2,int dp[][]){
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
    }
    public static String findLCS(int n, int m, String s1, String s2){
        // Write your code here.
        int dp[][]=new int [n+1][m+1];
        LCS(s1,s2,dp);
        StringBuilder sb=new StringBuilder();
        int i=n,j=m;
        while(dp[i][j]!=0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;}
            else{
                if(dp[i-1][j]>dp[i][j-1])
                    i--;
                else   
                    j--;
            }
        }
        return sb.reverse().toString();

    }
}