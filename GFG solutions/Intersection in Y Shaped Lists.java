/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    static Node intersectPoint(Node head1, Node head2) {
        // code here\
        Node t1=head1,t2=head2;
        int c1=0,c2=0;
        while(t1!=null)
        {
            c1++;
            t1=t1.next;
        }
        while(t2!=null)
        {
            c2++;
            t2=t2.next;
        }
        int co=0,c=0;
        if(c1>c2){
            c=c1-c2;
            while(co!=c){
                co++;
                head1=head1.next;}
        }
        else
        {
            c=c2-c1;
            while(co!=c)
            {
                co++;
                head2=head2.next;
            }
        }
        while(true)
        {
            if(head1==head2)
                return new Node(head1.data);
            head1=head1.next;
            head2=head2.next;
        }
            
        
    }
}