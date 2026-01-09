class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int []>it=new ArrayList<>();
        it.add(intervals[0]);
        for(int i=1;i<intervals.length;i++)
        {
            int n=it.size()-1;
            if(intervals[i][0]<=it.get(n)[1]){
                int s[]=it.get(n);
                s[1]=Math.max(intervals[i][1],s[1]);
                it.set(n,s);
            }
            else
                it.add(intervals[i]);
        }
    int ans[][]=new int[it.size()][2];
    for(int i=0;i<it.size();i++)
        ans[i]=it.get(i);
    return ans;

    }
}