package leetcode.hdkshjm.problem.no1000_1999.no1721;

import leetcode.hdkshjm.common.ListNode;

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        int count = 0;
        ListNode node = head;
        ListNode left = null;
        while (node != null) {
            if (count == k - 1) left = node;
            node = node.next;
            count++;
        }

        node = head;
        for (int i = 1; i <= count; i++) {
            if (i == count - k + 1) {
                int temp = left.val;
                left.val = node.val;
                node.val = temp;
                break;
            }
            node = node.next;
        }
        return head;
    }
}

