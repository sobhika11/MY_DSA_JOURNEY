class Solution {
    public int[] searchRange(int[] nums, int target) {
        int h=nums.length-1,l=0,mid=0;
        int a[]={-1,-1};
        while(l<=h){
            mid=l+(h-l)/2;
            if(nums[mid]==target){
                if(a[1]==-1)
                    a[1]=mid;
                a[0]=mid;
                h=mid-1;}
            else if(nums[mid]>target)
                h=mid-1;
            else if(nums[mid]<target)
                l=mid+1;
        }
    return a;
    }
}