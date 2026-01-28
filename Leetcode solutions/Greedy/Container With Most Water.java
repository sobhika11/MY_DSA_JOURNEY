class Solution {
    public int maxArea(int[] height) {
        
            int i=0,j=height.length-1;
            int maxi=0;
            while(i<j){
                int width=j-i;
                int left=height[i];
                int right=height[j];
                int length= height[i]>=height[j] ? height[j]:height[i];
                int curr=length*width;
                 if(curr>maxi)
                     maxi=curr;
                 if(left>right)
                    j--;
                 else
                     i++; 
            }
        
        return maxi;
    }
}