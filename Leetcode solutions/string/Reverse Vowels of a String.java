import java.util.ArrayList;

class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character>v=new ArrayList<>();
        StringBuilder sb=new StringBuilder(s);
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
                v.add(ch);
        }
        int j=v.size()-1;
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
                sb.setCharAt(i,v.get(j--));
        }   
    return sb.toString(); 
    }
}