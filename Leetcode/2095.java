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
    public ListNode deleteMiddle(ListNode head) {
        
        int n=len(head);
        if(n<2) return null;
        ListNode prev=null;
        ListNode curr=head;
        int stop=n/2;
        int start=0;
        while(start<stop)
        {
            prev=curr;
            curr=curr.next;
            start++;
        }
        prev.next=curr.next;
        curr.next=null;
        return head;
    }
    public static int len(ListNode temp)
    {
        int n=0;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        return n;
    }
}