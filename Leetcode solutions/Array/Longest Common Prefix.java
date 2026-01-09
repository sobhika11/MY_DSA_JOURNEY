class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length,min=Integer.MAX_VALUE;
        char [] a=strs[0].toCharArray();
        char [] b=strs[n-1].toCharArray();
        for(int i=0;i<n;i++)
            min=Math.min(min,strs[i].length());
        String s="";
        for(int i=0;i<min;i++)
        {
            if(a[i]!=b[i])
                break;
            s+=a[i];
        }
    return s;
    }
}