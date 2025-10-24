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
    public ListNode reverseKGroup(ListNode head, int k) {
       if (head == null || k == 1) return head;

        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;
        ListNode curr = head;

        while (true) {
            
            ListNode check = curr;
            for (int i = 0; i < k; i++) {
                if (check == null) return dummy.next;
                check = check.next;
            }

          
            ListNode prev = null;
            ListNode tail = curr;
            for (int i = 0; i < k; i++) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            
            prevGroup.next = prev;
            tail.next = curr;

            
            prevGroup = tail;
    }
    }
}