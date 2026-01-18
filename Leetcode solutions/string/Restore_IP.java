import java.util.ArrayList;
import java.util.List;

class Solution{
    public List<String> restoreIpAddresses(String s){
        List<String>a=new ArrayList<>();
        bt(s,0,0,new StringBuilder(),a);
        return a;
    }
    void bt(String s,int x,int y,StringBuilder b,List<String>a){
        if(y==4&&x==s.length()){
            a.add(b.substring(0,b.length()-1));
            return;
        }
        if(y==4||x==s.length())return;
        for(int z=1;z<=3&&x+z<=s.length();z++){
            String c=s.substring(x,x+z);
            if(c.length()>1&&c.charAt(0)=='0')break;
            int v=Integer.parseInt(c);
            if(v>255)break;
            int k=b.length();
            b.append(c).append('.');
            bt(s,x+z,y+1,b,a);
            b.setLength(k);
        }
    }
}