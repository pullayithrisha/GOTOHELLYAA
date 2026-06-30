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
    public ListNode middleNode(ListNode head) {
        //brute force
        int n=0;
        ListNode temp=head;
        while(temp!=null)
        {
            n++;
            temp=temp.next;  
        }
        System.out.println("n:"+n);
        int m=(n/2)+1;
        temp=head;
        while(temp!=null)
        {
           m-=1;
           if(m==0)
           {
             break;
           }
           temp=temp.next;
        }
        return temp;
    }
}