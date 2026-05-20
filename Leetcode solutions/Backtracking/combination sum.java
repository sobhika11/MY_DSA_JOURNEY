class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void back(int [] a,int t,int ind,int sum,List<Integer>path){
        if(sum==t){
            ans.add(new ArrayList<>(path));
            return;}
        if(sum>t || ind==a.length)
            return;
        path.add(a[ind]);
        back(a,t,ind,sum+a[ind],path);
        path.remove(path.size()-1);
        back(a,t,ind+1,sum,path);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>path=new ArrayList<>();
        back(candidates,target,0,0,path);
        return ans;
    }
}