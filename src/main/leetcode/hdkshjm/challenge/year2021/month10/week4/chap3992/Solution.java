package leetcode.hdkshjm.challenge.year2021.month10.week4.chap3992;


class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        int[] headIndices = new int[k];
        int remainder = length % k - 1;
        for (int i = 1; i < headIndices.length; i++) {
            headIndices[i] = headIndices[i - 1] + length / k;
            if (remainder >= 0) {
                headIndices[i]++;
                remainder--;
            }
        }

        ListNode[] ret = new ListNode[k];
        ListNode previous = null;
        int count = 0;
        for (int i = 0; i < headIndices.length; i++) {
            while (head != null) {
                if (count == headIndices[i]) {
                    ret[i] = head;
                    if (previous != null) previous.next = null;
                    break;
                }
                previous = head;
                head = head.next;
                count++;
            }
        }
        return ret;
    }
}
