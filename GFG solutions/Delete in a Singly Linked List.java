/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if (x == 1) {
            return head.next;
        }

        Node temp=head;
        int c=1;
        while(temp!=null)
        {
            if((c+1)==x){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
            c++;
        }
        return head;
    }
}