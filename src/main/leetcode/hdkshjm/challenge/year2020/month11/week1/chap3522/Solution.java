package leetcode.hdkshjm.challenge.year2020.month11.week1.chap3522;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<ListNode> q1 = new ArrayDeque<>();
        Deque<ListNode> q2 = new ArrayDeque<>();

        while (l1 != null) {
            q1.add(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            q2.add(l2);
            l2 = l2.next;
        }

        ListNode ret = null;
        int carry = 0;
        while (!q1.isEmpty() || !q2.isEmpty()) {
            l1 = q1.pollLast();
            l2 = q2.pollLast();

            int val = carry;
            if (l1 != null) val += l1.val;
            if (l2 != null) val += l2.val;
            carry = val / 10;
            val = val % 10;
            ret = new ListNode(val, ret);
        }
        if (carry > 0) {
            ret = new ListNode(carry, ret);
        }

        return ret;
    }
}
