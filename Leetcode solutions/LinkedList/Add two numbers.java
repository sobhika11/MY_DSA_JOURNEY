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
import java.math.*;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0,carry=0;
        ListNode head = new ListNode(0);
        ListNode temp=head;
        while(l1!=null || l2!=null || carry!=0)
            {
                sum=0;
                sum+=carry;
                if(l1!=null){
                    sum+=l1.val;
                    l1=l1.next;}
                if(l2!=null){
                    sum+=l2.val;
                    l2=l2.next;}
                carry=sum/10;
                ListNode nd=new ListNode(sum%10);
                temp.next=nd;
                temp=nd;
            }
        return head.next;
    }
}