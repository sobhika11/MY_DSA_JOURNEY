/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans=null;
    public void preorder(TreeNode root,int tg){
        if(root==null)
            return ;
        if(tg==root.val){
            ans=root;
            return;}
        preorder(root.left,tg);
        preorder(root.right,tg);
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            if(cloned==null)
                return cloned;
             preorder(cloned,target.val);
             return ans;
    }
}