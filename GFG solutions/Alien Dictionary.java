import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    String s="";
    public void bfs(ArrayList<ArrayList<Integer>>adj,int []deg){
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<deg.length;i++)
            {
                if(deg[i]==0)
                    q.add(i);
            }
            while(!q.isEmpty()){
                int val=q.poll();
                s+=(char)(val+'a');
                for(int v:adj.get(val)){
                    deg[v]--;
                    if(deg[v]==0)
                        q.add(v);
                }
                
            }
    }
    public String findOrder(String[] words) {
        // we will find the first mismatch char,not more than that
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<26;i++)
            adj.add(new ArrayList<>());
        int deg[]=new int[26];
        Arrays.fill(deg,-1);
        int c=0;
        for(String k:words){
            for(char ch:k.toCharArray()){
                if(deg[ch-'a']==-1){
                    deg[ch-'a']=0;
                    c++;}
            }
        }
        for(int i=0;i<words.length-1;i++){
            String fi=words[i];
            String la=words[i+1];
            int min=Math.min(fi.length(),la.length());
            boolean f=false;
            for(int j=0;j<min;j++){
                int u=fi.charAt(j)-'a',v=la.charAt(j)-'a';
                if(u!=v){
                    adj.get(u).add(v);
                deg[v]++;
                f=true;
                break;
                }
            }
            if(!f && fi.length()>la.length())
                return new String();
           
        }
        bfs(adj,deg);
        if(s.length()==c)
            return s;
        return "";
    }
}