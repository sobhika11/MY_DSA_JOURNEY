// User function Template for Java

class Solution {
    
    public int findpar(int v,int []par){
        if(par[v]==v)
            return v;
        int nd=findpar(par[v],par);;
        par[v]=nd;
        return nd;
    }
        
    // Function to merge two nodes a and b.
    public void union_(int a, int b, int par[], int rank[]) {
        // add your code here
        int upa=findpar(a,par);
        int upb=findpar(b,par);
        if(rank[upa]<rank[upb])
            par[upa]=upb;
        else if(rank[upa]>rank[upb])
            par[upb]=upa;
        else{
            par[upb]=upa;
            rank[upa]++;
        }
        
    }

    // Function to check whether 2 nodes are connected or not.
    public Boolean isConnected(int a, int b, int par[], int rank[]) {
        // add your code here
        return findpar(a,par)==findpar(b,par);
        
    }
}