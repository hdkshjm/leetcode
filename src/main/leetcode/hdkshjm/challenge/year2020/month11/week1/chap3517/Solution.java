package leetcode.hdkshjm.challenge.year2020.month11.week1.chap3517;


class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        ListNode newHead = head;
        ListNode input = head.next;
        newHead.next = null;
        while (input != null) {
            ListNode next = input.next;
            ListNode node = newHead;
            while (node != null) {
                if (input.val <= node.val) {
                    input.next = node;
                    if (node == newHead) newHead = input;
                    break;
                }

                if (node.next == null) {
                    node.next = input;
                    input.next = null;
                    break;
                }

                if (input.val > node.val && input.val <= node.next.val) {
                    ListNode temp = node.next;
                    node.next = input;
                    input.next = temp;
                    break;
                }
                node = node.next;
            }
            input = next;
        }

        return newHead;
    }
}
