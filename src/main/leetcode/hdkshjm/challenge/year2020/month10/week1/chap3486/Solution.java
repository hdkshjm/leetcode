package leetcode.hdkshjm.challenge.year2020.month10.week1.chap3486;

class Solution {
    int backStep;
    ListNode newHead;

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        int length = getLength(head);
        k = k % length;
        if (k == 0 || length == 1) {
            return head;
        }

        findNewHeadNode(head, head, k);
        return this.newHead;
    }

    public int getLength(ListNode node) {
        int ret = 0;
        while (node != null) {
            ret++;
            node = node.next;
        }
        return ret;
    }

    public void findNewHeadNode(ListNode node, ListNode head, int k) {
        if (node == null) {
            backStep = 0;
            return;
        }

        findNewHeadNode(node.next, head, k);
        backStep++;
        if (backStep == 1) {
            node.next = head;
        }
        if (backStep == k) {
            this.newHead = node;
        }
        if (backStep == k + 1) {
            node.next = null;
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
