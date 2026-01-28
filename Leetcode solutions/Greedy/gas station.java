class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int gas_sum = Arrays.stream(gas).sum();
        int cost_sum = Arrays.stream(cost).sum();
        int diff[]=new int[gas.length];
        if(gas_sum<cost_sum)
            return -1;
        int to=0,f=1;
        for(int i=0;i<n;i++)
            diff[i]=gas[i]-cost[i];
        int ind=0;
        for(int i=0;i<n;i++){
            to+=diff[i];
            if(to<0){
                to=0;
                f=1;
            }
            else 
                if(f==1){
                    ind =i;
                    f=0;}
                
        }
        if(to>=0)
            return ind;
          
    return -1;    
    }
}