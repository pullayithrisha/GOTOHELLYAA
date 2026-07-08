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
    public int pairSum(ListNode head) {
        int res=Integer.MIN_VALUE;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode cur=slow;
        ListNode conn=prev;
        ListNode pre=null;
        while(cur!=null)
        {
            ListNode after=cur.next;
            cur.next=pre;
            pre=cur;
            cur=after;
        }
        conn.next=pre;
        System.out.println(pre.val+" "+conn.val);
        int sum=0;
        ListNode temp=head;
       while(temp!=conn.next && pre!=null)
       {
            sum= temp.val+pre.val;
            res=Math.max(res,sum);
            temp=temp.next;
            pre=pre.next;
       }
        return res;
    }
}