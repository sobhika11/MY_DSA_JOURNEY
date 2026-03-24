class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int []>heap=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<score.length;i++)
            heap.add(new int[]{score[i],i});
        String ans[]=new String[score.length];
        int f= 1;
        while(!heap.isEmpty()){
            int a[]=heap.poll();
            if(f==1)
                ans[a[1]]="Gold Medal";
            else if(f==2)
                ans[a[1]]="Silver Medal";
            else if(f==3)
                ans[a[1]]="Bronze Medal";
            else
                ans[a[1]]=String.valueOf(f);
            f++;
                
        }
    return ans;
    }
}