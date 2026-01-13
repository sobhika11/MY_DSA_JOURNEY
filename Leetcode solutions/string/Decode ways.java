class Solution{
    public int numDecodings(String s){
        if(s==null||s.length()==0||s.charAt(0)=='0')return 0;
        int n=s.length();
        int x=1,y=1;
        for(int i=1;i<n;i++){
            int z=0;
            if(s.charAt(i)!='0')z+=y;
            int v=Integer.parseInt(s.substring(i-1,i+1));
            if(v>=10&&v<=26)z+=x;
            x=y;
            y=z;
        }
        return y;
    }
}