package leetcode.hdkshjm.month11.week1.chap3486;

class Solution {
    int backStep;
    ListNode leftStart;
    ListNode leftEnd;
    ListNode rightEnd;

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        int length = getLength(head);
        k = k % length;
        if (k == 0 || length == 1) {
            return head;
        }

        findNewHeadNode(head, k);
        leftEnd.next = head;
        rightEnd.next = null;
        return this.leftStart;
    }

    public int getLength(ListNode node) {
        int ret = 0;
        while (node != null) {
            ret++;
            node = node.next;
        }
        return ret;
    }

    public void findNewHeadNode(ListNode node, int k) {
        if (node == null) {
            backStep = 0;
            return;
        }

        findNewHeadNode(node.next, k);
        backStep++;
        if (backStep == 1) {
            leftEnd = node;
        }
        if (backStep == k) {
            leftStart = node;
        }
        if (backStep == k + 1) {
            rightEnd = node;
        }
    }
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
};
