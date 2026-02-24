import java.util.*;
public class Main
{
    public static void union(int[] par,int[] rank,int u,int v){
        int upu=findpar(par,u);
        int upv=findpar(par,v);
        if (upu == upv) return;
        if(rank[upu]>rank[upv])
            par[upv]=upu;
        else if(rank[upu]<rank[upv])    
            par[upu]=upv;
        else{
            rank[upu]++;
            par[upv]=upu;
        }
    }
    public static int findpar(int[] par,int v){
        if(par[v]==v)
            return v;
        int x=findpar(par,par[v]);
        par[v]=x;
        return x;
        
    }
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int m=read.nextInt();
		int par[]=new int[n+m+1];
		int rank[]=new int[m+n+1];
		for(int i=0;i<=n+m;i++)
		    par[i]=i;
		boolean f=false;
		for(int i=1;i<=n;i++){
		    int len=read.nextInt();
		    if(len>0)
		        f=true;
		    while(len-->0){
            int lang = read.nextInt();
            union(par, rank, i, lang + n);
            }
		       
		}
		if(!f)
		    System.out.println(n);
		else{
		     	HashSet<Integer>set=new HashSet<>();
		for(int i=0;i<=n+m;i++)
		    findpar(par,i);
		for(int i=1;i<=n;i++)
		    set.add(findpar(par,i));
		System.out.println(set.size()-1);
		}
	
		 
		    
	}
}
