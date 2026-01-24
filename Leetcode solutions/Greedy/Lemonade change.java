class Solution {
    public int[] diStringMatch(String s) {
       int d=s.length(),c=0;
        int a[]=new int[s.length()+1];
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='I')
        {
            a[i]=c++;
            if(i==s.length()-1)
                a[i+1]=c;
        }
            
        if(s.charAt(i)=='D'){
            a[i]=d--;
            if(i==s.length()-1)
                a[i+1]=d;
        }
            
       } 
    return a;
    }
}