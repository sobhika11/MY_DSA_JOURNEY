class Solution {

    public int integerReplacement(int num) {
        int c=0;
        long n=num;
        while(n!=1)
        {
            if(n%2==0)
                n/=2;
            else{
                if((n==3) || ((n&2)==0))
                    n--;
                else
                    n++;
            }
        c++;
        }
    return c;

    }
}