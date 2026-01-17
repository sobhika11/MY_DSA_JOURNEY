class Solution {
    public int divide(int dividend,int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
            return Integer.MAX_VALUE;

        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        long ans=0;

        while(a>=b) {
            long temp=b,cnt=1;
            while((temp<<1)<=a) {
                temp<<=1;
                cnt<<=1;
            }
            a-=temp;
            ans+=cnt;
        }

        if((dividend<0)^(divisor<0))
            ans=-ans;

        return (int)ans;
    }
}
