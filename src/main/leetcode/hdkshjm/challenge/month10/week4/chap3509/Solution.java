package leetcode.hdkshjm.challenge.month10.week4.chap3509;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return null;

        ListNode loopedNode = head;
        ListNode tempNpde = head.next.next;
        int lastIndex = 0;
        for (int i = 1; i <= 100000; i++) {
            if (loopedNode == tempNpde) {
                lastIndex = i;
                break;
            }
            loopedNode = loopedNode.next;
            if (tempNpde.next == null || tempNpde.next.next == null) return null;
            tempNpde = tempNpde.next.next;
        }

        int loopLength = 1;
        tempNpde = loopedNode.next;
        for (int i = 1; i <= 100000; i++) {
            if (loopedNode == tempNpde) {
                loopLength = i;
                break;
            }
            tempNpde = tempNpde.next;
        }


        int start = Math.max(0, lastIndex - loopLength);
        for (int i = 0; i < start; i++) {
            head = head.next;
        }

        for (int i = start; i <= lastIndex; i++) {
            ListNode node = loopedNode;
            for (int j = 0; j <= loopLength; j++) {
                if (head == node) {
                    return head;
                }
                node = node.next;
            }
            head = head.next;
        }
        return null;
    }
}
