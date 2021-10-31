package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0430;

import java.util.Stack;

class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;

        Stack<Node> stack = new Stack<>();
        Node node = head;
        while (node.next != null || node.child != null || !stack.isEmpty()) {
            if (node.child == null) {
                if (node.next == null) {
                    node.next = stack.pop();
                    node.next.prev = node;
                }
                node = node.next;
                continue;
            }

            if (node.next != null) stack.add(node.next);
            node.next = node.child;
            node.next.prev = node;
            node.child = null;
            node = node.next;
        }

        return head;
    }
}
