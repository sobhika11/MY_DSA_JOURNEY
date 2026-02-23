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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode val1=new TreeNode(val);
            val1.right=null;
            val1.left=root;
            return val1;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int c=1;
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0;i<len;i++){
                TreeNode nd=q.poll();
                if(depth-1==c){
                    TreeNode val1=new TreeNode(val);
                    val1.left=nd.left;
                    TreeNode val2=new TreeNode(val);
                    val2.right=nd.right;
                    nd.left=val1;
                    nd.right=val2;
                }
                else{
                    if(nd.left!=null)
                        q.add(nd.left);
                    if(nd.right!=null)
                        q.add(nd.right);
                }
            }
            System.out.println(len+" "+c);
            if(depth-1==c)
                break;
            c++;
        }
    return root;
    }
}