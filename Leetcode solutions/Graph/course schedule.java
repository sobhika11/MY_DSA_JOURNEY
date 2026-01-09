class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int V=numCourses;
        int deg[]=new int[V];
        int co=0;
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int e[]:prerequisites){
            adj.get(e[1]).add(e[0]);
            deg[e[0]]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(deg[i]==0){
                q.add(i);
                co++;}
        }
        while(!q.isEmpty()){
            int val=q.poll();
            for(int v:adj.get(val)){
                deg[v]--;
            if(deg[v]==0){
                q.add(v);
                co++;}
            }
                
        }
    if(co==V)
        return true;
    return false;
    }
}