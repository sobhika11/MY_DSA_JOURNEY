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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head,ntail=head;
        int size=1;
        if(head==null)
            return head;
        while(temp.next!=null)
            {
                temp=temp.next;
                size++;
            }
        k=k%size;
        if(k==0)
            return head;
        int len=size-k;
        for(int i=1;i<len;i++)
            ntail=ntail.next;
        ListNode nhead=ntail.next;
        ntail.next=null;
        temp.next=head;
        return nhead;
    }
}