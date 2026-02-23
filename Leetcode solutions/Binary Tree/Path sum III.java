/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long sum=0;
    int c=0;
    HashMap<Long,Integer>map=new HashMap<>();
    {
        map.put(0L,1);
    }
    public void dfs(TreeNode root,int tg){
        if(root==null)
            return;
        sum+=root.val;
        if(map.containsKey(sum-tg))
            c+=map.get(sum-tg);
        map.put(sum,map.getOrDefault(sum,0)+1);
        dfs(root.left,tg);
        dfs(root.right,tg);
        map.put(sum,map.get(sum)-1);
        sum-=root.val;
        
    }
    public int pathSum(TreeNode root, int targetSum) {
        // map.put(0L,1);
        dfs(root,targetSum);
        return c;    
    }
}