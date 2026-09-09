class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c=0,n=nums.length,pro=1,l=0;
        for(int r=0;r<nums.length;r++){
            pro *=nums[r];
            while(pro>=k && l<nums.length) {
                pro/=nums[l];
                l++;
            }
            c+=r-l+1;
        }
        return c;
    }
}