class Solution {
    public double findMaxAverage(int[] nums, int k) {
        Double max=-Double.MAX_VALUE,sum=0.0;
        if(nums.length==1)
            return nums[0];
        int l=0,len=0;
        for(int r=0;r<nums.length;r++){
            len=r-l+1;
            sum+=nums[r];
            if(len>k){
                sum-=nums[l];
                l++;
            }
            
             if (len==k) {
                max = Math.max(max, sum / k);
            }
            
        }
        return max;
    }
}