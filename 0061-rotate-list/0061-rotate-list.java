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
    public ListNode reverse(ListNode head)
    {
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null)
        {
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public ListNode getk(ListNode temp,int k)
    {
        k--;
        while(temp!=null&&k>0)
        {
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
            int n = 0;
            ListNode temp = head;
            while (temp != null) {
                n++;
                temp = temp.next;
            }
            k = k % n;
            if (k == 0) return head;
        head=reverse(head);
        ListNode kthnode = head;
        for (int i = 1; i < k; i++) {
            kthnode = kthnode.next;
        }
        ListNode prevlast=kthnode;
        ListNode secondpart=kthnode.next;
        kthnode.next=null;
        ListNode part1=reverse(head);
        ListNode part2=reverse(secondpart);
        temp=part1;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=part2;
        return part1;


    }
}