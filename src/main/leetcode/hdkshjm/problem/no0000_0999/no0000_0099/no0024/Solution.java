package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0024;

import leetcode.hdkshjm.common.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode first = head.next;
        ListNode second = head;
        ListNode third = head.next.next;
        first.next = second;
        second.next = swapPairs(third);
        return first;
    }
}
