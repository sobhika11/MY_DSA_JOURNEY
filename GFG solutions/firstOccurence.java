class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        if(txt.equals(pat)) return 0;
        int n=txt.length();
        int c=pat.length();
        for(int i=0;i<=n-c;i++)
        {
            if(txt.substring(i,i+c).equals(pat))
                return i;
        }
    return -1;
    }
}