package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0203;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        if (head == null) return null;

        ListNode node = head;
        ListNode previous = node;
        while (node != null) {
            if (node.val == val) previous.next = node.next;
            else previous = node;
            node = node.next;
        }
        return head;
    }
}
