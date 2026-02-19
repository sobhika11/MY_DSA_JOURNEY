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
    List<List<Integer>>res=new ArrayList<>();
    List<Integer>li=new ArrayList<>();
    int sum=0;
    public void dfs(TreeNode root,int tg){
        if(root==null)
            return;
        li.add(root.val);
        sum+=root.val;
        if(tg==sum && root.left==null && root.right==null)
            res.add(new ArrayList<>(li));
        dfs(root.left,tg);
        dfs(root.right,tg);
        sum-=root.val;
        li.remove(li.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null)  
            return res;
        dfs(root,targetSum);
        return res;
    }
}