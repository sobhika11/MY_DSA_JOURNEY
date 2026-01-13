import java.util.HashMap;

class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        for(char ch:s.toCharArray())
        {
            if(map.get(ch)==1)
                return ch;
        }
    return '$';
    }
}