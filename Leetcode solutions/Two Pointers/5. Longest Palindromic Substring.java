class Solution {
    public static boolean isPalindrome(String str,int i,int j)
    {
        // int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
                {
                    return false;
                }
            i++;
            j--;
        }
    return true;
    }
    public String longestPalindrome(String s) {
        int st=0,maxlen=1;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(isPalindrome(s,i,j)  && (j-i+1)>maxlen)
                    {
                        st=i;
                        maxlen=j-i+1;
                    }
            }
    
        }
    return s.substring(st,st+maxlen);
    }
}