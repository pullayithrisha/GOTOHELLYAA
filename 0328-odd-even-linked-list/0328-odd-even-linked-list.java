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
    public ListNode oddEvenList(ListNode head) {
         if (head == null || head.next == null) {
            return head;
        }
        ListNode temp=head;
        ArrayList<Integer> a=new ArrayList<>();
        while(temp!=null&&temp.next!=null)
        {
            a.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null){
                a.add(temp.val);
                temp=temp.next;
        } 
        temp=head.next;
        while(temp!=null&&temp.next!=null)
        {
            a.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null){
                a.add(temp.val);
                temp=temp.next;
        }
        System.out.println("a:"+a);
        int i=0;
        temp=head;
        while(temp!=null)
        {
            temp.val=a.get(i);
            temp=temp.next;
            i++;
        }
        return head;
        
    }
}