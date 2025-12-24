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
    long x=Long.MIN_VALUE,y=Long.MAX_VALUE;
    public boolean dfs(TreeNode root,long y,long x){
        if(root==null)
            return true;
        return root.val>x && root.val<y && (dfs(root.left,root.val,x) && dfs(root.right,y,root.val));
        
    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root,y,x);
    }
}