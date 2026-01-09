class Solution {
    public static StringBuilder cns(StringBuilder str)
    {
        
        int n = str.length();
      StringBuilder s=new StringBuilder();
      for(int i=0;i<str.length();i++)
        {
            int c=1;
            while (i<n-1 && str.charAt(i)==str.charAt(i+1))
            {
                i++;
                c++;
            }
            
            s.append(c);
            s.append(str.charAt(i));
        }
        
    return s;
    }
    public String countAndSay(int n) {
        StringBuilder ans=new StringBuilder("1");
        for(int i=1;i<n;i++)
            {
                  ans=cns(ans);   
            }
        return ans.toString();
    }
}