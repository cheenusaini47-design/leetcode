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
    public int gcb(int a,int b){
        if(b==0){
            return a;
        }
        return gcb(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr !=null && curr.next != null){
            ListNode newcurr = curr.next;
            int gcbval = gcb(curr.val,curr.next.val);
            ListNode node = new ListNode(gcbval);
            node.next = newcurr;
            curr.next = node;
            curr = newcurr;
        }
        return head ;
    }
}