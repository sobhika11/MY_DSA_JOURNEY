class Solution {
    public int jump(int[] nums) {
        //like relay a person goes first and then anga he will find max,then when jump is necessay max vechu maximum jump will be executed

        int max=0,jump=0,curr=0;
        for(int i=0;i<nums.length-1;i++)
        {
            max=Math.max(max,(nums[i]+i));
            if(i==curr)  
                {
                    jump++;
                    curr=max;
                }
        }
    return jump;
    }
}