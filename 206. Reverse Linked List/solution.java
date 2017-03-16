public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newNode = new ListNode(-1);
        while (head != null) {
            ListNode next = head.next;
            head.next = newNode;
            newNode = head;
            head = next;
        }
        return head;
    }
}