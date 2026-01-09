class Solution {
    ArrayList<Integer>li=new ArrayList<>();
    public void bfs(ArrayList<ArrayList<Integer>>adj,int []deg){
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<deg.length;i++){
            if(deg[i]==0)
                q.add(i);
        }
        while(!q.isEmpty()){
            int val=q.poll();
            li.add(val);
            for(int v:adj.get(val)){
                deg[v]--;
                if(deg[v]==0)
                    q.add(v);
            }
        }
        
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>(V);
        int deg[]=new int[V];
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int e[]:edges){
            adj.get(e[0]).add(e[1]);
            deg[e[1]]++;
        }
        bfs(adj,deg);
        return li;
        
    }
}