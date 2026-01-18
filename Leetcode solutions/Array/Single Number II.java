class Solution{
    public int singleNumber(int[] a){
        int x=0;
        for(int i=0;i<32;i++){
            int c=0;
            for(int n:a) if(((n>>i)&1)==1) c++;
            if(c%3!=0) x|=(1<<i);
        }
        return x;
    }
}
