class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer>s=new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int t=-(nums[i]+nums[j]);
                if(s.contains(t))
                    {
                        ArrayList<Integer>li=new ArrayList<>(Arrays.asList(nums[i],nums[j],t));
                        Collections.sort(li);
                        set.add(li);
                    }
                s.add(nums[j]);
            }
        }
    List<List<Integer>>li=new ArrayList<>(set);
    return li;

    }
}