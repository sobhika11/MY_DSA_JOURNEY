class Solution {
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
                {
                    ind =i;
                    break;
                }
        }
        if(ind==-1)
            reverse(nums,0,nums.length-1); 
        else
        {
            for(int i=nums.length-1;i>ind;i--)
            {
                if(nums[i]>nums[ind])
                {
                    int t=nums[i];
                    nums[i]=nums[ind];
                    nums[ind]=t;
                    break;
                }
            }
        reverse(nums,ind+1,nums.length-1); 
        }
    }
}