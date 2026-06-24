class Solution {
    public int longestCycle(int[] edges) {
        int m=edges.length;
        int lc=-1,ct=0;
        int vis[]=new int[m+1];
        for(int i=0;i<m;i++){
            if(vis[i]==0){
                int st=ct;
                int curr=i;
            while(curr!=-1){
               if (vis[curr] == 0) {
                        vis[curr] = ct; 
                        ct++;
                        curr = edges[curr];
                    } else {
                        if (vis[curr] >= st) {
                            int cycleLen = ct - vis[curr];
                            lc = Math.max(lc, cycleLen);
                        }
                        break; 
                    }   
            }
        }
    }
    return lc;
  }
}