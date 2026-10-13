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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        int n= 0;
         ListNode curr = head;
         while(curr != null){
            n++;
            curr= curr.next;
         }
         int ss = n/k;
         int sr = n%k;
         ListNode newcurr = head;
         ListNode prev = null;
         for(int i = 0;i<k;i++){
             ListNode ans = newcurr;
             int size = ss;
             if(sr>0){
                size++;
                sr--;
             }
             int j = 0;
             while(j<size){
                prev = newcurr;
                newcurr = newcurr.next;
                j++;
             }
             if(prev != null){
                prev.next = null;
             }
             res[i] = ans;

         }
         return res;
    }
}