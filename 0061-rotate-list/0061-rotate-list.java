/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
/**/
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 ){
            return head; 

        }
        if(head==null || head.next == null){
            return head;
        }
        ListNode tail = null;
        int size = 0;
        ListNode curr = head;
        while(curr!=null){
            tail = curr;
            curr=curr.next;
            size++;
        }
        int newk = k%size;
        if(newk ==0){

            return head;
        } 
        int diff = size-newk;
        int i = 0;
        curr = head;
        while(i< diff-1){
            curr= curr.next;
            i++;

        }
        ListNode newhead = curr.next;
        curr.next = null;
        tail.next = head;
        return newhead;
    }
}