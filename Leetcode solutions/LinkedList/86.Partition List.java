/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
       ListNode h=new ListNode(0);
       ListNode t=new ListNode(0);
        ListNode hptr=h;
        ListNode tptr=t;
        while(head!=null)
            {
                ListNode nd=new ListNode(head.val);
                if(head.val<x)
                {
                    hptr.next=nd;
                    hptr=hptr.next;
                }
                else{
                    tptr.next=nd;
                    tptr=tptr.next;
                }
            head=head.next;
            }
        hptr.next=t.next;
        return h.next;
        
        
    }
}