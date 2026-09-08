class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max=0,sum=0;
        int l=0;
        HashSet<Integer>set=new HashSet<>();
        for(int r=0;r<nums.length;r++){
            if(set.contains(nums[r])){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum-=nums[l];
                l++;
                }
            }
            sum+=nums[r];
            set.add(nums[r]);
            if((r-l+1)==k){
                max=Math.max(max,sum);
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
                }
        }
    return max;
    }
}