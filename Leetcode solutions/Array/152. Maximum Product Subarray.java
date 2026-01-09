class Solution {
    public int maxProduct(int[] nums) {
        int pref=1,suff=1,n=nums.length-1,suff_max=nums[0],pref_max=Integer.MIN_VALUE;
        for(int i=0;i<=n;i++)
        {
            pref*=nums[i];
            pref_max=Math.max(pref,pref_max);
            suff*=nums[n-i];
            suff_max=Math.max(suff,suff_max);
            if(nums[i]==0)
                pref=1;
            if(nums[n-i]==0)
                suff=1;
            
        }
    
    return Math.max(suff_max,pref_max);
    }
}