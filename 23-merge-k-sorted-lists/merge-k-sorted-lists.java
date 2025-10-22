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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(ListNode n: lists){
            if(n != null){
                pq.add(n);
            }

        }
        ListNode head = pq.peek();

        while(!pq.isEmpty()){
            ListNode current = pq.poll();
            if(current.next != null){
                pq.add(current.next);
            }
            current.next = pq.peek();
        }
        return head;
    }
}