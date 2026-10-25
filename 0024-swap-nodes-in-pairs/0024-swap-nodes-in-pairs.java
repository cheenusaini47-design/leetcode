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
    public void sp(ListNode prev,ListNode head){
        if(head == null|| head.next ==  null ){
            return;
        }
        ListNode f = head;
        ListNode s = head.next;
        f.next = s.next;
        s.next = f;
        prev.next = s;
        sp(f,f.next);
    }
    public ListNode swapPairs(ListNode head) {
        ListNode dumm = new ListNode(-1);
        dumm.next = head ;
        ListNode p = dumm;
        sp(p,head);
        return dumm.next;
    }
}