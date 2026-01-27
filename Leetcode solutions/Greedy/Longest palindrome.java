class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        boolean f=true;
        int c=0;
        for(int a:map.values())
            {
                if(a%2==0)
                    c+=a;
                else
                {
                    if(f)
                        c++;
                    c+=a-1;
                    f=false;
                }
            }
        return c;
    }
}