package leetcode.hdkshjm.challenge.year2021.month01.week2.chap3601;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode preHead = new ListNode(-1);
        ListNode previous = preHead;
        while (l1 != null || l2 != null) {
            int l1Val = 0;
            if (l1 != null) {
                l1Val = l1.val;
                l1 = l1.next;
            }

            int l2Val = 0;
            if (l2 != null) {
                l2Val = l2.val;
                l2 = l2.next;
            }

            previous.next = new ListNode((l1Val + l2Val + carry) % 10);
            previous = previous.next;
            carry = (l1Val + l2Val + carry) / 10;
        }

        if (carry > 0) {
            previous.next = new ListNode(carry);
        }

        return preHead.next;
    }
}
