class Solution {
    public void moveZeroes(int[] nums) {
       int j=1,n=nums.length;
       if(n>1){
        int i=0;
       while(j<n)
        {
            if(nums[i]==0 && nums[j]!=0)
            {
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;

            }
            else if(nums[i]!=0)
                i++;
            
            j++;
        }
        }
    }
}