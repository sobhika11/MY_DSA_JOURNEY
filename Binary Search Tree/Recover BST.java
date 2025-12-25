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
    TreeNode f=null;
    TreeNode l=null;
    TreeNode m=null;
    TreeNode prev=null;
    public void recover(TreeNode root){
        if(root==null)
            return;
        recover(root.left);
        if(prev!=null && root.val<prev.val){
            if(f==null)
                {
                    f=prev;
                    m=root;
                }
            else
                l=root;

        }
        prev=root;
        recover(root.right);
        
    }
    public void swap(TreeNode f,TreeNode l){
        int d=f.val;
        f.val=l.val;
        l.val=d;
    }

    //before movin to right change prev fro left no change and check condition in data part
    public void recoverTree(TreeNode root) {
        recover(root);
        if(f!=null && l!=null)
            swap(f,l);
        else if(f!=null && m!=null)
            swap(f,m);
    }
}