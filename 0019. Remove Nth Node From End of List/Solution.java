class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        if(head.next == null && n == 1) return null;

        ListNode slow = head;
        ListNode fast = head;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        
        // if n == listsize 
        //    => fast will become null and first element is the one which needs to remove
        // we can compare size with n, but its a heavy operation
        // so simply check null for fast.
        // fast will null when size=n
        if(fast == null) {
            return head.next;
        }
        

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    } 
}
