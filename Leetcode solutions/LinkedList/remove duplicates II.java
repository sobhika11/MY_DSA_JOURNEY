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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode nd=new ListNode(0);
        nd.next=head;
        ListNode ptr=nd;
        while(head!=null){
            boolean f=false;
            while(head.next!=null && head.val==head.next.val){
                head=head.next;
                f=true;
            }
            if(f)
                ptr.next=head.next;
            else
                ptr=ptr.next;
            head=head.next;
        }
    return nd.next;
    }
}