/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode ,TreeNode>map=new HashMap<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode x=q.poll();
            if(x.left!=null)
            {
                map.put(x.left,x);
                q.add(x.left);
            }
            if(x.right!=null){
                map.put(x.right,x);
                q.add(x.right);
            }
        }
        int dist=0,x=1,y=0;
        q=new LinkedList<>();
        HashMap<TreeNode,Boolean>mp=new HashMap<>();
        mp.put(target, true);
        q.add(target);
        while(!q.isEmpty() && dist<k){
            while(x>0){
                TreeNode n=q.poll();
                x--;
                if(n.left!=null && !mp.containsKey(n.left)){
                    q.add(n.left);
                    mp.put(n.left, true);
                    y++;
                }
                if(n.right!=null && !mp.containsKey(n.right)){
                    q.add(n.right);
                    mp.put(n.right, true);
                    y++;
                }
                if(map.get(n)!=null && !mp.containsKey(map.get(n)))
                {
                    q.add(map.get(n));
                    mp.put(map.get(n), true);
                    y++;
                }
            }
            dist++;
            x=y;
            y=0;
        }
        List<Integer>li=new ArrayList<>();
        while(!q.isEmpty())
            li.add(q.poll().val);
        return li;

    }
}