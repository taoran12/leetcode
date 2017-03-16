/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode fakeNode = new ListNode(-1);
        fakeNode.next = head;
        ListNode pre = fakeNode;
        while(head != null) {
            if(head.val == val) {
                pre.next = head.next;
            }
            else
            {
                pre = head;
            }
            head = head.next;
        }
        return fakeNode.next;
        
    }
}