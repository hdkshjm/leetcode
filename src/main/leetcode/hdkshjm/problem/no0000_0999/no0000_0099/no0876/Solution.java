package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0876;

import leetcode.hdkshjm.common.ListNode;

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            node = node.next;
            count++;
        }

        count = count / 2;
        node = head;
        while (count > 0) {
            node = node.next;
            count--;
        }
        return node;
    }
}
