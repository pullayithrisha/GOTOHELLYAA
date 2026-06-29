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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null) return head;
        if(head==null||left==right) return head;
        ListNode prev=null;
        ListNode cur=head;
        int count=1;
        while(count<left)
        {
            prev=cur;
            cur=cur.next;
            count++;
        }
        ListNode conn=prev;
        ListNode startlist=cur;
        for(int i=0;i<right-left+1;i++)
        {
            ListNode after=cur.next;
            cur.next=prev;
            prev=cur;
            cur=after;
        }
        startlist.next=cur;
        if(conn!=null)
        {
            conn.next=prev;
        }
        else
        {
            head=prev;
        }
        return head;
    }
}