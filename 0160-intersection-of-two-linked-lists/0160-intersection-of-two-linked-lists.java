/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> hm=new HashMap<>();
        ListNode t1=headA;
        while(t1!=null)
        {
            hm.put(t1,1);
            t1=t1.next;
        }
        t1=headB;
        while(t1!=null)
        {
            if(hm.containsKey(t1))
            {
                return t1;
            }
            t1=t1.next;
        }
        return null;
    }
}