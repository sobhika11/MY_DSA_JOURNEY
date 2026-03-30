class Solution {
    public String largestNumber(int[] nums) {
        Integer[] num = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(num,new Comparator<Integer>(){
            public int compare(Integer a,Integer b)
                {
                    String x=a.toString()+""+b.toString();
                    String y=b.toString()+""+a.toString();
                return y.compareTo(x);
                    
                }
        });
        if(num[0]==0)
            return "0";
        StringBuilder s=new StringBuilder();
        for(Integer i:num)
            s.append(i);
        return s.toString();
    }
}