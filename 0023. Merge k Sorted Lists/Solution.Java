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
        if(lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode node : lists) {
            if(node != null) 
                queue.offer(node);
        }

        ListNode list3 = new ListNode();
        ListNode l3 = list3;

        while(!queue.isEmpty()) {
                ListNode current = queue.poll();
                list3.next = current;
                list3 = list3.next;

                if(current.next != null) 
                    queue.offer(current.next);
        }
        return l3.next;
    }
}
