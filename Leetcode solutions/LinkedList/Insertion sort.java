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
    public int len(ListNode head){
        int c=0;
        while(head!=null)
        {
            head=head.next;
            c++;
        }
        return c;
    }
    public ListNode insertionSortList(ListNode head) {
        ListNode start=new ListNode(head.val);
        ListNode end=start;
        ListNode temp=head;
        temp=temp.next;
        while(temp!=null){
            ListNode nd=new ListNode(temp.val);
            if(temp.val>end.val){
                end.next=nd;
                end=nd;
            }
            else if(temp.val<start.val){
                nd.next=start;
                start=nd;
            }
            else{
                ListNode t=start;
                while(t.next!=null && t.next.val<nd.val)
                    t=t.next;
                ListNode ne=t.next;
                t.next=nd;
                nd.next=ne;
                
            }
            System.out.print(end.val+" ");
            temp=temp.next;
        }
    return start;
    }
}