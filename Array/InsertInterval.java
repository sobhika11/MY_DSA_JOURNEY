class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       ArrayList<int[]>li=new ArrayList<>();
       int i=0,n=intervals.length;
            while(i<n && intervals[i][1]<newInterval[0]){
                int a[]=intervals[i];
                li.add(a);
                i++;
            }
            while(i<n && intervals[i][0]<=newInterval[1]){
                int a[]=intervals[i];
                newInterval[0]=Math.min(newInterval[0],a[0]);
                newInterval[1]=Math.max(newInterval[1],a[1]);
                i++;
            }  
        li.add(newInterval);
        while(i<n){
            li.add(intervals[i]);
            i++;
        }
    int [][] arr=new int[li.size()][2];
    for(int j=0;j<li.size();j++)
        arr[j]=li.get(j);
    return arr;
        
    }
}