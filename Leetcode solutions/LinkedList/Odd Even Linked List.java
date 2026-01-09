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
    public ListNode oddEvenList(ListNode head) {
        ListNode ehead=null,etail=null;
        ListNode ohead=null,otail=null;
        int c=1;
        while(head!=null)
            {
                ListNode nd=new ListNode(head.val);
                if(c%2==1)
                {
                    if(ohead==null)
                    {
                        ohead=nd;
                        otail=nd;
                    }
                    else{
                        otail.next=nd;
                        otail=nd;
                    }
                }
                else
                {
                    if(ehead==null)
                    {
                        ehead=nd;
                        etail=nd;
                    }
                    else{
                        etail.next=nd;
                        etail=nd;
                    
                    }
                }
            head=head.next;
            c++;
            }
        if(ehead!=null)
            otail.next=ehead;
        return ohead;
    }
}