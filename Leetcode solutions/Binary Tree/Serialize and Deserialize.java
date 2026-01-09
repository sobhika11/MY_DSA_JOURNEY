/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
            return "";
        StringBuilder s=new StringBuilder();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode x=q.poll();
            if(x==null) 
                s.append("#,");
            else{
                s.append(x.val).append(",");
                q.add(x.left);
                q.add(x.right);
            }
        }
    return s.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals(""))    
            return null;
        String [] s=data.split(",");
        Queue<TreeNode>q=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(s[0]));
        q.add(root);
        int i=1;
        while(!q.isEmpty() && i<s.length){
            TreeNode x=q.poll();
            if(!s[i].equals("#")){
                TreeNode y=new TreeNode(Integer.parseInt(s[i]));
                x.left=y;
                q.add(y);
                
            }
            i++;
            if(!s[i].equals("#")){
                TreeNode y=new TreeNode(Integer.parseInt(s[i]));
                x.right=y;
                q.add(y);
                
            }
            i++;

        }
    return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));