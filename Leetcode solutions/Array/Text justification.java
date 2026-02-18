class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int c=0;
        ArrayList<String>li=new ArrayList<>();
        ArrayList<String>res=new ArrayList<>();
        for(int j=0;j<words.length;j++){
            if(c+li.size()+words[j].length()<=maxWidth){
                li.add(words[j]);
                c+=words[j].length();
            }
            else{
                int t=maxWidth-c;
                int gaps=li.size()-1;
                String st="";
                if(gaps==0){
                    st+=li.get(li.size()-1);
                    while(t-->0)
                        st+=" ";
                }
                else{
                    int sp=t/gaps,ex=t%gaps;
                    for(int k=0;k<li.size();k++){
                        st+=li.get(k);
                        if(k<gaps){
                            for(int i=0;i<sp;i++)
                                st+=" ";
                            if(k<ex)
                                st+=" ";
                        }
                        
                    }
                }
            li.clear();
            c=0;
            res.add(st);
            j--;
            }
        }
    String last = "";
    for(int i=0;i<li.size();i++){
        last+=li.get(i);
        if(i!=li.size()-1)
            last+=" ";
    }
    while(last.length() < maxWidth)
            last += " ";
    res.add(last);
    
    return res;
    }
}