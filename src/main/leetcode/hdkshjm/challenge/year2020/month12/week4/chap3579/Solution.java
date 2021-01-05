package leetcode.hdkshjm.challenge.year2020.month12.week4.chap3579;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode preNode = new ListNode(0, head);

        head = preNode;
        while (head.next != null) {
            ListNode left = head.next;
            if (left.next == null) break;
            ListNode right = left.next;

            head.next = right;
            left.next = right.next;
            right.next = left;
            head = left;
        }

        return preNode.next;
    }
}
