package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0142;

import leetcode.hdkshjm.common.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head.next == null) return null;
        ListNode slow = head.next;
        if (slow.next == null) return null;
        ListNode fast = slow.next;

        while (slow != fast) {
            slow = slow.next;
            if (fast.next == null || fast.next.next == null) return null;
            fast = fast.next.next;
        }

        ListNode first = slow;
        ListNode second = head;
        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return first;
    }
}
