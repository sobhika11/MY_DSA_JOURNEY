

class Solution {
    public int myAtoi(String s) {
        // Your code here
        int k=0;
        int sigh=1,i=0,n=s.length();
        while(i<n && s.charAt(i)==' ')
            i++;
        if(i<n && s.charAt(i)=='-'){
            sigh=-1;
            i++;
        }
        else if(i<n && s.charAt(i)=='+')
            i++;
        
        while(i<n && (s.charAt(i)>='0' && s.charAt(i)<='9'))
        {
           int ch=(int)s.charAt(i)-48;
           k=k*10+ch;
           if(k>Integer.MAX_VALUE/10 || (k==Integer.MAX_VALUE && ch>7)){
               if(sigh==1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
               
           }
           i++;
           
        }
        
        return (sigh*k);
    }
}