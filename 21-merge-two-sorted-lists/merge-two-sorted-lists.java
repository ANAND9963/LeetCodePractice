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
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
       ListNode tempA = a;
        ListNode tempB = b;
        ListNode c = new ListNode(-1);
        ListNode tempC = c;

        while(tempA!=null && tempB!=null){
            if(tempA.val<=tempB.val){
                ListNode t = new ListNode(tempA.val);
                tempC.next = t;
                tempC  = t;
                tempA = tempA.next;
            }
            else{
                ListNode t = new ListNode(tempB.val);
                tempC.next = t;
                tempC  = t;
                tempB = tempB.next;
            }
        }
        if(tempA==null){
            tempC.next = tempB;
        }
        else  tempC.next = tempA;
        return c.next;

    }
}