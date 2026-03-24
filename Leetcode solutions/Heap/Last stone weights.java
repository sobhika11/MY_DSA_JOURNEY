class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones)
            q.add(i);
        while(q.size()>1){
            int x=q.poll();
            int y=q.poll();
            if(x!=y)
                q.add(x-y);
        }
    return q.size()==0?0:q.poll();
    }
}