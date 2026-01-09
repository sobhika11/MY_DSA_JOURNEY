class Solution {
    public boolean dfs(int [][]graph,int co,int colors[],int v){
        colors[v]=co;
        for(int nei:graph[v]){
            if(colors[nei]==-1 && dfs(graph,1-co,colors,nei)==false)
                    return false;
            else if(colors[nei]==colors[v]) 
                return false;
        }
    return true;
    }
    public boolean isBipartite(int[][] graph) {
        int m=graph.length;
        int colors[]=new int[m];
        Arrays.fill(colors,-1);
        for(int i=0;i<m;i++){
            if(colors[i]==-1 && dfs(graph,0,colors,i)==false)
                    return false;
        }
    return true;
    }
}