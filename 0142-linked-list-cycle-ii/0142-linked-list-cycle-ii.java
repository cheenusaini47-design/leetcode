/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> no = new HashSet<>();
        ListNode curr = head;
         while(curr!= null){
            if(no.contains(curr)){
                return curr;
            }
            no.add(curr);
            curr=curr.next;

         }
         return null;
        
    }
}
