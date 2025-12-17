/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    
    public void leftviewUtil(Node root,ArrayList<Integer>li,int r){
        if(root==null)
            return;
        if(li.size()==r)
            li.add(root.data);
        leftviewUtil(root.left,li,r+1);
        leftviewUtil(root.right,li,r+1);
        
    }
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer>li=new ArrayList<>();
        if(root==null)
            return li;
        leftviewUtil(root,li,0);
        return li;
        
    }
}