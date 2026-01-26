class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer>freq=new HashMap<>();
        for(char i:tasks)
            freq.put(i,freq.getOrDefault(i,0)+1);
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(freq.values());
        int time=0,cycle=n+1;
        while(!pq.isEmpty())
        {
            ArrayList<Integer>list=new ArrayList<>();
            int i=0;
            while(i<cycle && !pq.isEmpty())
            {
                int f=pq.poll();
                f--;
                time++;
                i++;
                if(f>0)
                    list.add(f);
            }
            if(i<cycle && !list.isEmpty())
                time+=cycle-i;
            pq.addAll(list);
        }
    return time; 
    }
}