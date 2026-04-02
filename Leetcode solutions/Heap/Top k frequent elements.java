class pair{
    int x,y;
    pair(int a,int b)
    {
        x=a;
        y=b;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:nums)
            map.put(val,map.getOrDefault(val,0)+1);
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->a.y-b.y);
        for(Map.Entry<Integer,Integer> freq:map.entrySet())
        {
            pq.add(new pair(freq.getKey(),freq.getValue()));
            if(pq.size()>k)
                pq.poll();
        }
        int a[]=new int[k];
        int i=0;
        for(pair p:pq)
            a[i++]=p.x;
        return a;
    }
}