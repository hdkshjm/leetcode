package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0002;

import leetcode.hdkshjm.common.ListNode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1Value;
            if (l1 == null) {
                l1Value = 0;
            } else {
                l1Value = l1.val;
                l1 = l1.next;
            }

            int l2Value;
            if (l2 == null) {
                l2Value = 0;
            } else {
                l2Value = l2.val;
                l2 = l2.next;
            }

            int val = (l1Value + l2Value + carry) % 10;
            carry = (l1Value + l2Value + carry) / 10;
            if (current == null) {
                current = new ListNode(val);
                head = current;
            } else {
                current.next = new ListNode(val);
                current = current.next;
            }
        }

        if (carry == 1) {
            current.next = new ListNode(carry);
            current = current.next;
        }

        return head;
    }
}
