package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0328;

import leetcode.hdkshjm.common.ListNode;

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null) return head;

        int index = 0;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        ListNode node = head;
        while (node != null) {
            ListNode next = node.next;
            if (index % 2 == 0) {
                odd.next = node;
                odd = odd.next;
            } else {
                even.next = node;
                even = even.next;
            }
            node = next;
            index++;
        }
        odd.next = evenHead;
        even.next = null;

        return head;
    }
}
