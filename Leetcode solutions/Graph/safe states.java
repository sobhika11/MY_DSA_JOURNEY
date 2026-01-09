class Solution {
    ArrayList<Integer>li=new ArrayList<>();
    public void bfs(ArrayList<ArrayList<Integer>>adj,int []deg,int v){
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(deg[i]==0)
                q.add(i);
        }
        while(!q.isEmpty()){
            int val=q.poll();
            li.add(val);
            for(int nd:adj.get(val)){
                deg[nd]--;
            if(deg[nd]==0)  
                q.add(nd);}

        }
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<graph.length;i++)
            adj.add(new ArrayList<>());
        int deg[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int v:graph[i]){
                adj.get(v).add(i);
                deg[i]++;}
        }
        bfs(adj,deg,graph.length);
        Collections.sort(li);
        return li;

    }
}