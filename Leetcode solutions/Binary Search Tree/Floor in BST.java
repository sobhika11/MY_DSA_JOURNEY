/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    int floor(Node root, int x) {
        // code here
        int ceil=-1;
        while(root!=null){
            if(root.data==x)
                return root.data;
            if(x>root.data)
            {
                ceil=root.data;
                root=root.right;
            }
            else
                root=root.left;
        }
    return ceil;
    }
}