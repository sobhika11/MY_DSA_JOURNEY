class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int l=0,max=1;
        boolean gt=false,lt=false;
        for(int r=1;r<arr.length;r++){
                if(arr[r-1] > arr[r]){
                    if(!lt)
                        l = r - 1;
                    gt = true;
                    lt = false;           
                }
                else if(arr[r-1] < arr[r]){
                    if(!gt)
                        l = r - 1;
                    lt=true;
                    gt=false;
                }
                else{
                    l=r;
                    gt=false;
                    lt=false;
                }

            max = Math.max(max,r-l+1);
        }
    return max;
    }
}