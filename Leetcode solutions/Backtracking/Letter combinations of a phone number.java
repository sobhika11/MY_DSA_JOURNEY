class Solution {
    List<String>ans=new ArrayList<>();
    public void backtrack(StringBuilder s,int ind,int index,String str,HashMap<Integer,String>map){
        if(index==str.length()){
            ans.add(s.toString());
            return;}
        String k=map.get(str.charAt(index)-'0');
        for(char ch:k.toCharArray()){
            backtrack(s.append(ch),ind+1,index+1,str,map);
            s.deleteCharAt(s.length()-1);
            }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, String> map = new HashMap<>() {{
        put(2, "abc");
        put(3, "def");
        put(4, "ghi");
        put(5, "jkl");
        put(6, "mno");
        put(7, "pqrs");
        put(8, "tuv");
        put(9, "wxyz");
        }};
        backtrack(new StringBuilder(),0,0,digits,map);
        return ans;
        
    }
}