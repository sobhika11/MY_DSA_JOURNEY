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
    public boolean symmetricUtil(TreeNode nd1,TreeNode nd2){
        if(nd1==null && nd2==null)
            return true;
        if(nd1==null || nd2==null)
            return false;
        return nd1.val==nd2.val && symmetricUtil(nd1.left,nd2.right) && symmetricUtil(nd1.right,nd2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return symmetricUtil(root.left,root.right);

    }
}