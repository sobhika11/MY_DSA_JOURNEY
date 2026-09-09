class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       int l=0,n=s.length(),len=0;
        int pfreq[]=new int[26];
        int wfreq[]=new int[26];
        for(char ch:p.toCharArray())
            pfreq[ch-'a']++;
        List<Integer>li=new ArrayList<>();
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            len=r-l+1;
            wfreq[ch-'a']++;
            if(len>p.length()){
                wfreq[s.charAt(l) -'a']--;
                l++;
                len--;
            }
            if(Arrays.equals(pfreq,wfreq))
                li.add(l);
    
        }
    return li;
    }
}