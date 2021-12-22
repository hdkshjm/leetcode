package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0143;

import leetcode.hdkshjm.common.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public void reorderList(ListNode head) {
        Deque<ListNode> deque = new ArrayDeque<>();
        ListNode node = head;
        while (node != null) {
            deque.add(node);
            node = node.next;
        }

        ListNode previous = new ListNode();
        while (!deque.isEmpty()) {
            previous.next = deque.pollFirst();
            previous = previous.next;

            if (!deque.isEmpty()) {
                previous.next = deque.pollLast();
                previous = previous.next;
            }
            previous.next = null;
        }
    }
}
