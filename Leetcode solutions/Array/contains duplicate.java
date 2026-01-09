class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        boolean f=false;
       for(Integer val:map.values())
        {
            if(val>1)
            {
                f=true;
                break;
            }
                // f=true;

        }
    return f;
    }
}