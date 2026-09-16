class Solution {
    public boolean hasMatch(String s, String p) {
        String[] a=p.split("\\*", -1);
        String fi=a[0],la=a[1];
        int x=s.indexOf(fi);
        if(x==-1)
            return false;
        return s.indexOf(la,x+fi.length())!=-1;
    }
}