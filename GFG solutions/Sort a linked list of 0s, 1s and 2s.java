/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        Node zero=new Node(-1);
        Node one=new Node(-1);
        Node two=new Node(-1);
        Node zeroptr=zero,oneptr=one,twoptr=two;
        while(head!=null)
        {
            Node nd=new Node(head.data);
            if(head.data==0){
                zeroptr.next=nd;
                zeroptr=zeroptr.next;}
            else if(head.data==1){
                oneptr.next=nd;
                oneptr=oneptr.next;
            }
            else{
                twoptr.next=nd;
                twoptr=twoptr.next;
            }
        head=head.next;
                
        }
        oneptr.next=two.next;
        zeroptr.next=one.next;
        // twoptr.next=null;
        return zero.next;
    }
}