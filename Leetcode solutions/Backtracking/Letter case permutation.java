class Solution {
    List<String>ans=new ArrayList<>();
    public void backtrack(String s,int ind){
        if(ind==s.length()){
            ans.add(s);
            return;
        }
        String st,lo;
        if(Character.isLetter(s.charAt(ind))){
            st=s.substring(0,ind)+Character.toUpperCase(s.charAt(ind))+s.substring(ind+1);
            lo=s.substring(0,ind)+Character.toLowerCase(s.charAt(ind))+s.substring(ind+1);
            backtrack(st,ind+1);
            backtrack(lo,ind+1);
        }
        else
            backtrack(s,ind+1);
    }
    public List<String> letterCasePermutation(String s) {
        backtrack(s,0);
        return ans;
    }
}