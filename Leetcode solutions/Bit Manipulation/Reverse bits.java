class Solution {
    public int reverseBits(int n) {
        int res=0,c=0;
        for(int i=0;i<32;i++){
            int b=n%2;
            res=res*2+b;
            n/=2;
        }
        return res;
    }
}