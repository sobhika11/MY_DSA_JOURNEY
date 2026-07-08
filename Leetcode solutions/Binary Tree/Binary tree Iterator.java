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
class BSTIterator {
    ArrayList<Integer>li;
    int ind=0;
    public BSTIterator(TreeNode root) {
        li=new ArrayList<>();
       in_order(root);
    }
    
    public int next() {
        return li.get(ind++);
        
    }
    
    public boolean hasNext() {
        
        return ind<li.size();
    }
    public void in_order(TreeNode root){
        if(root==null)
            return;
        in_order(root.left);
        li.add(root.val);
        in_order(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */