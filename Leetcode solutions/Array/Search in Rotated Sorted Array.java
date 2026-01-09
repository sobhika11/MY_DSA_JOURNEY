class Solution {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1,mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[l]<=nums[mid])
            {
                if(nums[l]<=target && nums[mid]>=target)
                    h=mid-1;
                else
                    l=mid+1;
            }
            else
            {
                if(nums[mid]<=target && nums[h]>=target)
                    l=mid+1;
                else
                    h=mid-1;
            }
        }
    return -1;
    }
}