class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int carry = 0; 
        
        ListNode current = dummy;
        while(l1 != null || l2 != null || carry !=0) {
            int sum = (l1 == null? 0 : l1.val) + (l2 == null? 0 : l2.val) + carry;
            current.next = new ListNode(sum % 10);
            carry = sum / 10;
            current = current.next;
            l1 = l1 == null? null : l1.next;
            l2 = l2 == null? null : l2.next;
        }
        return dummy.next;
    }
}
