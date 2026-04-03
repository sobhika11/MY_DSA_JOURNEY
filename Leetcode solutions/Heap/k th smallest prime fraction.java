class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n=arr.length;
        PriorityQueue<int []>q=new PriorityQueue<>((a,b)->Double.compare((double)b[0] / b[1], (double)a[0] / a[1]));
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                q.add(new int[]{arr[i],arr[j]});
                if(q.size()>k)
                    q.poll();
            }
        }
    return q.poll();
    }
}