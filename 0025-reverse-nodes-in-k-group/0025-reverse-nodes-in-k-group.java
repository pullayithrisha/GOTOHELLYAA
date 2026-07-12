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
    public ListNode reverse(ListNode temp)
    {
        ListNode prev=null;
        ListNode cur=temp;
        while(cur!=null)
        {
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevLast=null;
        while(temp!=null)
        {
            ListNode kthnode=getk(temp,k);
            if(kthnode==null)
            {
                if(prevLast!=null) {
                    prevLast.next=temp;
                }
                break;
            }
            ListNode nextnode=kthnode.next;
            kthnode.next=null;
            reverse(temp);
            if(head==temp)
            {
                head=kthnode;
            }
            else
            {
                prevLast.next=kthnode;
            }
            prevLast=temp;
            temp=nextnode;
        }
        return head;
    }
}