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
    Long x=Long.MIN_VALUE,y=Long.MAX_VALUE;
    int ind=0;
    public TreeNode bst(int [] preorder,long x,long y){
        if(ind>=preorder.length || preorder[ind]<=x || preorder[ind]>=y) return null;
        TreeNode root=new TreeNode(preorder[ind]);
        ind++;
        root.left=bst(preorder,x,root.val);
        root.right=bst(preorder,root.val,y);
        return root;

    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return bst(preorder,x,y);
    }
}