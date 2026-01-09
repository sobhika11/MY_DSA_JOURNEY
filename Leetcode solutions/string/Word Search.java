class Solution {
    public boolean dfs(char b[][],int ind,int i,int j,String s)
    {
        if(ind==s.length())
            return true;
        if(i>=b.length || j>=b[0].length || i<0 || j<0)
            return false;
        if(b[i][j]!=s.charAt(ind))
            return false;
        char t=b[i][j];
        b[i][j]='*';
        boolean f=dfs(b,ind+1,i,j+1,s)|| dfs(b,ind+1,i,j-1,s) || dfs(b,ind+1,i+1,j,s) || dfs(b,ind+1,i-1,j,s);
        b[i][j]=t;
        return f;
        

    }
    public boolean exist(char[][] board, String word) {
        int ind=0,n=word.length();
        for(int i=0;i<board.length;i++)
        {
           for(int j=0;j<board[0].length;j++)
                if( dfs(board,0,i,j,word))
                    return true;
        }
    return false;
    }
}