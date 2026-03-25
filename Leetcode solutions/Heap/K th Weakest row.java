class Solution {
    public int count(int a[]){
        int c=0;
        for(int i=0;i<a.length;i++)
            if(a[i]==1)
                c++;
        return c;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int []>q=new PriorityQueue<>((a,b)->{
            if(a[0]==b[0])
                return a[1]-b[1];
            return a[0]-b[0];
        });
        for(int i=0;i<mat.length;i++){
            int c=count(mat[i]);
            q.add(new int[]{c,i});
        }
        int ans[]=new int[k];
        int c=0;
        while(c<k)
            ans[c++]=q.poll()[1];
        return ans;
    }
}