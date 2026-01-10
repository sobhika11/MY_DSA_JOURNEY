/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node head)
    {
        Node temp=head,prev=null;
        while(temp!=null)
        {
            Node nd=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nd;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        int carry=1,sum=0;
        Node temp=reverse(head);
        Node t=temp;
        while(temp!=null)
        {
            sum=temp.data+carry;
            temp.data=sum%10;
            // System.out.print(temp.data+" ");
            carry=sum/10;
            if(carry==0)
                break;
            if (temp.next == null && carry > 0) {
                temp.next = new Node(0);
            }
            temp=temp.next;
            sum=0;
        }
        temp=reverse(t);
    return temp;
        
    }
}