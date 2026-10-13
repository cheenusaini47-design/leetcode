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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> sat = new HashSet<>();
        for(int i : nums){
            sat.add(i);

        }
        ListNode dam = new ListNode(0);
        dam.next = head;
         ListNode curr = head;
          ListNode prev = dam;
          while(curr!=null){
            if(sat.contains(curr.val)){
                prev.next = curr.next;
                curr = curr.next;
            }else{
                prev = curr;
                curr = curr.next;
            }
          }
          return dam.next;
    }
}