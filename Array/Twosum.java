import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++)
            {
                if(map.containsKey(nums[i])){
                    a[0]=i;
                    a[1]=map.get(nums[i]);
                    break;
                }
                map.put(target-nums[i],i);
            }
        return a;
    }
}