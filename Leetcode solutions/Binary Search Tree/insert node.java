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
    public TreeNode insertNodeUtil(TreeNode root,int x){
        if(root==null)
            return new TreeNode(x);
        if(x>root.val)
            root.right=insertNodeUtil(root.right,x);
        else
            root.left=insertNodeUtil(root.left,x);
        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insertNodeUtil(root,val);
    }
}