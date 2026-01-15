class Solution {
    public String addBinary(String a, String b) {
        int c=0;
        if(b.length()>a.length())
            {
                String at=a;
                a=b;
                b=at;
            }
        int i=a.length()-1,j=b.length()-1,bi=0;
        StringBuilder st=new StringBuilder();
        while(i>=0 || j>=0)
        {
             bi=a.charAt(i)-'0';
            i--;
            int sum=bi+c;
            if(j>=0)
                {
                    sum+=b.charAt(j)-'0';
                    j--;

                }
            st.append(sum%2);
            c=sum/2;
        }
        if(c>0)
            st.append('1');
        return st.reverse().toString();
    }
}