// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
        ArrayList<Character>li=new ArrayList<>();
        for(char ch:s.toCharArray())
        {
            if(li.contains(ch))
                return ch+"";
            li.add(ch);
        }
    return "-1";
    }
}