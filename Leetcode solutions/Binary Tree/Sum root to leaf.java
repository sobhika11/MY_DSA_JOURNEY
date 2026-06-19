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
    int sum=0;
    public void sum(TreeNode root,String s){
        if(root==null ||(root.left==null && root.right==null) || s.equals('0')){
           sum+=Integer.parseInt(s);
           return;
        }
        String l="0";
        String r="0";
        if(root.left!=null)
         l=s+root.left.val;
        if(root.right!=null)
         r=s+root.right.val;
        sum(root.left,l);
        sum(root.right,r);

    }
    public int sumNumbers(TreeNode root) {
        String s=String.valueOf(root.val);
        sum(root,s);
        return sum;
    }
}