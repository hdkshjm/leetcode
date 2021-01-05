package leetcode.hdkshjm.challenge.year2020.month10.week2.chap3493;

class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;

        int length = 1;
        ListNode end = head;
        while (end.next != null) {
            length++;
            end = end.next;
        }
        return mergeSort(head, length);
    }

    public ListNode mergeSort(ListNode head, int length) {
        if (length == 1) {
            return head;
        }

        ListNode leftEnd = head;
        ListNode rightHead = head;
        int leftLength = 0;
        while (leftLength < length / 2) {
            leftLength++;
            leftEnd = rightHead;
            rightHead = leftEnd.next;
        }
        leftEnd.next = null;

        ListNode sortedLeft = mergeSort(head, leftLength);
        ListNode sortedRight = mergeSort(rightHead, length - leftLength);

        return merge(sortedLeft, sortedRight);
    }

    public ListNode merge(ListNode left, ListNode right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        ListNode head;
        if (left.val > right.val) {
            head = right;
            head.next = merge(left, right.next);
        } else {
            head = left;
            head.next = merge(left.next, right);
        }
        return head;
    }
}