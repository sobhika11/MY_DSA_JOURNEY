class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        Stack<Character>st=new Stack<>();
        Set<Character>set=new HashSet<>();
        int freq[]=new int[26];
        for(char ch:s.toCharArray())
            freq[ch-'a']++;
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']--;
            if(set.contains(ch))
                    continue;
           else
            {
                while(!st.isEmpty() && st.peek()>ch && freq[st.peek()-'a']>0)
                    set.remove(st.pop());
                st.push(ch);
                set.add(ch);

            }
        }
         StringBuilder res = new StringBuilder();
        for (char c : st) res.append(c);
        return res.toString();

    }
}