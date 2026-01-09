class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int V=numCourses;
        int a[]=new int[V];
        int k=V-1;
        int deg[]=new int[V];
        int co=0;
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int e[]:prerequisites){
            adj.get(e[0]).add(e[1]);
            deg[e[1]]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(deg[i]==0){
                q.add(i);
                co++;}
        }
        while(!q.isEmpty()){
            int val=q.poll();
            a[k--]=val;
            for(int v:adj.get(val)){
                deg[v]--;
            if(deg[v]==0){
                q.add(v);
                co++;}
            }
                
        }
    if(co==V)
        return a;
    return new int[]{};
        
    }
}