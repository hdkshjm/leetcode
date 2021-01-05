package leetcode.hdkshjm.challenge.year2021.month01.week1.chap3593;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode preHead = new ListNode(-101, head);
        ListNode previous = preHead;
        ListNode node = preHead;
        int duplicated = -101;
        while (node != null) {
            if (node.val == duplicated) {
                node = node.next;
                continue;
            }

            if (node.next != null && node.val == node.next.val) {
                previous.next = null;
                duplicated = node.val;
                node = node.next;
                continue;
            }

            previous.next = node;
            previous = node;
            node = node.next;
        }

        return preHead.next;
    }
}
