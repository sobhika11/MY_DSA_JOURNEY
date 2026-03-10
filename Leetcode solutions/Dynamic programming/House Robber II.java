class Solution {
    public int cost(int nums[]){
        int n=nums.length;
        if(n == 1) return nums[0];
        int a=nums[0],b=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
           int c=Math.max(nums[i]+a,b);
            a=b;
            b=c;
        }
    return b;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
            return nums[0];
        int temp[]=Arrays.copyOfRange(nums,0,n-1);
        int temp2[]=Arrays.copyOfRange(nums,1,n);
        return Math.max(cost(temp),cost(temp2));

    }
}