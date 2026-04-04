class Solution {
    public static boolean binary(int [][] a,int target)
    {
        int i=0,j=a.length-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            int r=mid/n,c=mid%n;
            int val=a[r][c]
            if(val==target)
                return true;
            if(val>target)
                j=mid-1;
            else if(val<target)
                i=mid+1;

        }
        return false;
    
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        
            if(binary(matrix,target))
                return true;
        
        return false;
    }
}