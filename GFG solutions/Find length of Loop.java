/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    public int cycle(Node slow)
    {
        Node temp=slow.next;
        int c=1;
        while(temp!=slow){
            c++;
            temp=temp.next;
        }
    return c;
    }
    public int countNodesinLoop(Node head) {
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
                return cycle(slow);
        }
    return 0;
    }
}