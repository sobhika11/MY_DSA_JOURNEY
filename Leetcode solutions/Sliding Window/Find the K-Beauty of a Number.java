class Solution {
    public int divisorSubstrings(int num, int k) {
        String st=Integer.toString(num);
        int co=0;
        if(st.length()<k)  
            return 0;
        for(int i=0;i<=st.length()-k;i++){
            int ch=Integer.valueOf(st.substring(i,i+k));
            if(ch!=0 && num%ch==0)
                co++;
        }
        return co;
    }
}