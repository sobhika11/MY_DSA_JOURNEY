class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int []>q=new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1])
                return Integer.compare(b[1],a[1]);
            return Integer.compare(b[0],a[0]);
        });
        for(int ch:arr){
            q.add(new int[]{ch,Math.abs(x-ch)});
            if(q.size()>k)  q.poll();
            }
        List<Integer>li=new ArrayList<>();
        while(!q.isEmpty())
            li.add(q.poll()[0]);
        Collections.sort(li);
        return li;
    }
}