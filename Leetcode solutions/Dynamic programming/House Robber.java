class Solution {
    // public static int cost(int n,int []nums){
    //     if(n<0)
    //         return 0;
    //     if(n-)
        
    // }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
            return nums[0];
        int a=nums[0];
        int b=Math.max(nums[0],nums[1]),c=b;
        for(int i=2;i<n;i++){
            c=Math.max(nums[i]+a,b);
            a=b;
            b=c;
        }
        return c;
    }
}