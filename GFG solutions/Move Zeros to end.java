class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int i=-1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0 && i==-1)
                i=j;
            if(i!=-1 && arr[j]!=0)
                arr[i++]=arr[j];
        }
        if(i==-1)
            return;
        for(int k=i;k<arr.length;k++)
            arr[k]=0;
        
    }
}
