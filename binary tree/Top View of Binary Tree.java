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
    int min=0;
    int max=0;
    public void preorder(Node root,int row,int col,HashMap<Integer,int[]>map){
        if(root==null)  
            return;
        if(!map.containsKey(col))
            map.put(col,new int[]{root.data,row});
        if(row<map.get(col)[1]){
            map.get(col)[1]=row;
            map.get(col)[0]=root.data;}
        min=Math.min(min,col);
        max=Math.max(col,max);
        preorder(root.left,row+1,col-1,map);
        preorder(root.right,row+1,col+1,map);
        
    }
    public ArrayList<Integer> topView(Node root) {
        HashMap<Integer,int[]>map=new HashMap<>();
        ArrayList<Integer>li=new ArrayList<>();
        preorder(root,0,0,map);
        for(int i=min;i<=max;i++)
            li.add(map.get(i)[0]);
        return li;
        
    }
}