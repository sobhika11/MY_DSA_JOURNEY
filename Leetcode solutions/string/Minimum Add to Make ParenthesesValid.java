class Solution {
    public int minAddToMakeValid(String s) {
        int c=0,ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')
                c++;
            else{
                if(c>0)
                    c--;
                else
                    ans++;
            }
        }
        return c+ans;
    }
}