

// User function Template for Java

class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        pat=pat.toLowerCase();
        txt=txt.toLowerCase();
        ArrayList<Integer>a=new ArrayList<>();
        int p=pat.length();
        int t=txt.length();
        for(int i=0;i<=t-p;i++)
        {
            if(txt.substring(i,i+p).equals(pat)){
                a.add(i);
            }
        }
        return a;
    }
}