// User function Template for Java
class Pair{
    int num,ct;
    Pair(int n,int ct)
    {
        num=n;
        this.ct=ct;
    }
}
class Solution {
    String printSequence(String s) {
        // code here
        HashMap<Character,Pair>map=new HashMap<>();
		int num=2,c=1;
		for(char ch='A';ch<='Z';ch++)
		{
		    if(ch=='D' || ch=='G' || ch=='J' || ch=='M' || ch=='P' || ch=='T' || ch=='W'){
		        c=1;
		        num++;}
		    map.put(ch,new Pair(num,c++));
		}
		String ans="";
		for(char ch:s.toCharArray())
		{
		    if(ch==' ')
		        ans+=0;
		    else
		    {
		        int n=map.get(ch).num;
		        int ct=map.get(ch).ct;
		        for(int i=0;i<ct;i++)
		            ans+=n;
		           
		    }
		}
	return ans;
    }
}