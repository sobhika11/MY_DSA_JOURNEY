import java.util.*;
import java.util.Arrays; 
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int [] arr=new int[nums1.length+nums2.length];
        int i;
        
        for( i=0;i<n;i++)
            arr[i]=nums1[i];
        for(int j=0;j<m;j++)
            arr[i+j]=nums2[j];
        Arrays.sort(arr);
       double median;
       if(arr.length %2==0){
        median = (arr[arr.length/2-1]+arr[arr.length/2])/2.0;
      }
      else{
        median = arr[arr.length/2];
      }
    
return median;
    }
}