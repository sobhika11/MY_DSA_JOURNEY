class Solution {
    List<String>ans=new ArrayList<>();
    public void backtrack(int j,String s,int n){
        if(j>=s.length())
            return ;
        String st=s.substring(0,j);
        String en=s.substring(j,n);
        List<String>left=new ArrayList<>();
        List<String>right=new ArrayList<>();
        int n1=st.length();
        int n2=en.length();
        String a,b;
        for(int i=1;i<st.length();i++){
            String l="";
            a=st.substring(0,i);
            b=st.substring(i,n1);
            if ((a.length() == 1 || a.charAt(0) != '0') && b.charAt(b.length() - 1) != '0'){
                l+=a+"."+b;
                left.add(l);}
        }
        if (st.length() == 1 || st.charAt(0) != '0')
                left.add(st);
                
        for(int i=1;i<en.length();i++){
            String l="";
            a=en.substring(0,i);
            b=en.substring(i,n2);
            if((a.length()==1 || a.charAt(0)!= '0' )&& (b.charAt(b.length()-1)!= '0') ){
                l+=a+"."+b;
                right.add(l);}
            
        }
        if (en.length() == 1 || en.charAt(0) != '0')
                right.add(en);
        
        for(int i=0;i<left.size();i++){
            for(int k=0;k<right.size();k++){
                String l="("+left.get(i)+", "+right.get(k)+")";
                ans.add(l);
            }
        }
        backtrack(j+1,s,n);

    }
    public List<String> ambiguousCoordinates(String s) {
        s=s.substring(1,s.length()-1);
        System.out.print(s+" ");
        backtrack(1,s,s.length());
        return ans;
    }
}