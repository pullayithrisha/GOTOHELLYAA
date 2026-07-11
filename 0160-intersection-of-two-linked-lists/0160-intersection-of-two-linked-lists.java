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
    public ListNode collison(ListNode l,ListNode s,int n)
    {
        while(n>0)
        {
            n--;
            l=l.next;
        }
        while(l!=s)
        {
            l=l.next;
            s=s.next;
        }
        return l;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // HashMap<ListNode,Integer> hm=new HashMap<>();
        // ListNode t1=headA;
        // while(t1!=null)
        // {
        //     hm.put(t1,1);
        //     t1=t1.next;
        // }
        // t1=headB;
        // while(t1!=null)
        // {
        //     if(hm.containsKey(t1))
        //     {
        //         return t1;
        //     }
        //     t1=t1.next;
        // }
        // return null;
        ListNode t=headA;
        int n1=0;
        int n2=0;
        while(t!=null)
        {
            n1++;
            t=t.next;
        }
        t=headB;
        while(t!=null)
        {
            n2++;
            t=t.next;
        }
        if(n1>n2) { return collison(headA,headB,n1-n2);}
         return collison(headB,headA,n2-n1);
    }
}