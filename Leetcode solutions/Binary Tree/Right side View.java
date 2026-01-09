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
    List<Integer>res=new ArrayList<>();
    public void preorder(TreeNode root,int row){
        if(root==null)
            return;
        if(res.size()==row)
            res.add(root.val);
        preorder(root.right,row+1);
        preorder(root.left,row+1);

    }
    public List<Integer> rightSideView(TreeNode root) {
        preorder(root,0);
    return res;    
    }
}