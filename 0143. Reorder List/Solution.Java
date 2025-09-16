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

 // slow pointer, fast pointer
 // meet -> circular
 // slow mid reach, when fast end -> after loop, slow denotes the mid
 //


 // 1. find the mid
 // 2. reverse the mid+1 list
 // 3. merger first half and reversed
class Solution {
    public void reorderList(ListNode head) {
      if (head == null || head.next == null) return;

      // get the mid
      // from next reverse
      // merge both list

    ListNode slow = head, fast = head;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    //
    ListNode node = slow.next;
    ListNode prev = null;
    ListNode next; 

    slow.next = null;

    while(node != null) {
        next = node.next;
        node.next = prev;
        prev = node;
        node = next;
    }
    //
    ListNode list1 = head;
    ListNode list2 = prev;

    ListNode l3 = new ListNode();
    ListNode list3 = l3;

    while(list1 != null && list2 != null) {
            l3.next = list1;
            list1 = list1.next;

            l3 = l3.next;
       
            l3.next = list2;
            list2 = list2.next;

            l3 = l3.next; 
    }
    l3.next = (list1 != null) ? list1 : list2;

    head = list3.next;
    }
}
