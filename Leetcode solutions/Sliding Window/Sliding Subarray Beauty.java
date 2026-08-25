class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]=new int[nums.length-k+1];
        int j=0;
        int a[]=new int 
        int left=0,right=0;
        for( right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(right-left+1==k){
                int c=0;
                for(int ch=-50;ch<=-1;ch++){
                    c += map.getOrDefault(ch, 0);
                    if(c>=x){
                        arr[j++]=ch;
                        break;
                    }
                     
                }
                if(c<x)
                    arr[j++]=0;
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) 
                    map.remove(nums[left]);
                left++;
            
            }
        }
        return arr;
    }
}