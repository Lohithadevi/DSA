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
        ListNode rev=null;
        ListNode track=new ListNode();
        ListNode point=head;
        int n=0;
        while(point!=null)
        {
            n++;
            ListNode curr=new ListNode();
            curr.val=point.val;
            if(rev==null)
            {
                rev=curr;
                track=rev;
            }
            else
            {
                track.next=curr;
                track=track.next;
            }
            point=point.next;
        }
        ListNode prev=null;
        ListNode curr=rev;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=null;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        int res=Integer.MIN_VALUE;
        int i=0;
        while(i<(n/2))
        {
            res=Math.max(res,head.val+prev.val);
            head=head.next;
            prev=prev.next;
            i++;
        }
        
        return res;
    }
}