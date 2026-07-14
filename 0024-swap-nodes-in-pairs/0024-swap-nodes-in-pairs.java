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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode temp=head;
         ListNode res=null;
         ListNode prev=temp;
        while(temp!=null && temp.next!=null)
        {
            ListNode second=temp.next;
            if(head==temp)
            {
                res=second;
                temp.next=second.next;
                second.next=temp;
                prev=temp;
                temp=temp.next;
            }
            else
            {
                prev.next=second;
                temp.next=second.next;
                second.next=temp;
                prev=temp;
                temp=temp.next;
            }
           
        }
        return res;
    }
}