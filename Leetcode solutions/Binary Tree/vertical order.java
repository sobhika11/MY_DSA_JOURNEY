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
class pair{
    int c;
    int r;
    int val;
    pair(int i,int j,int v)
    {
        r=j;
        c=i;
        val=v;
    }
}
class Solution {
    public void preorder(List<pair>li,TreeNode root,int row,int col){
        if(root==null)
            return;
        li.add(new pair(col,row,root.val));
        preorder(li,root.left,row+1,col-1);
        preorder(li,root.right,row+1,col+1);

    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<pair>li=new ArrayList<>();
        preorder(li,root,0,0);
        Collections.sort(li,(a,b)->{
            if(a.c!=b.c)
                return Integer.compare(a.c,b.c);
            if(a.r!=b.r)
                return Integer.compare(a.r,b.r);
            else
                return Integer.compare(a.val,b.val);
        });
        List<List<Integer>>res=new ArrayList<>();
        if(root==null)
            return res;
        int prevcol=Integer.MIN_VALUE;
        List<Integer>level=new ArrayList<>();
        for(pair p:li)
        {
            if(p.c!=prevcol)
            {
                if(prevcol!=Integer.MIN_VALUE)
                    res.add(level);
                level=new ArrayList<>();
                prevcol=p.c;
            }
            level.add(p.val);
        }
    res.add(level);
    return res;
    }
}