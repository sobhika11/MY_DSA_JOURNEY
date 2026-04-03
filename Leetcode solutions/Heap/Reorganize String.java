class Solution {
    class pair{
        char x;
        int y;
        pair(char ch,int v)
            {
                x=ch;
                y=v;
            }
    }
    public String reorganizeString(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        PriorityQueue<pair>q=new PriorityQueue<>((a,b)->b.y-a.y);
        for(char ch:map.keySet())
            q.add(new pair(ch,map.get(ch)));
        String res="";
        while(q.size()>1){
                pair p1=q.poll();
                pair p2=q.poll();
                res+=p1.x;
                p1.y--;
                res+=p2.x;
                p2.y--;
                if(p1.y>0)
                    q.add(p1);
                if(p2.y>0)
                    q.add(p2);
        } 
        if(!q.isEmpty()){
            pair p=q.poll();
            if(p.y>1)
                return "";
            res+=p.x;
        }
    return res;       
    }
}