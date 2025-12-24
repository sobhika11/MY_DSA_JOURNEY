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
    public TreeNode del(TreeNode root,int x){
        if(root==null)
            return root;
        if(x<root.val)
            root.left=del(root.left,x);
        else if(x>root.val)
            root.right=del(root.right,x);
        else
            {
                if(root.left==null)
                    return root.right;
                if(root.right==null)
                    return root.left;
                TreeNode y=root.right;
                while(y.left!=null)
                    y=y.left;
                root.val=y.val;
                root.right=del(root.right,y.val);
            }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        //inorder successor-right side oda leftmost
        //find inorder succecor
        // replcae the succesor value with target del node
        // now recusively call to del the successor node
        return del(root,key);

    }
}