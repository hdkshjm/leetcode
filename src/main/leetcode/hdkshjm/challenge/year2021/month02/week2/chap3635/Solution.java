package leetcode.hdkshjm.challenge.year2021.month02.week2.chap3635;

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node node = head;
        while (node != null) {
            Node copied = new Node(node.val);
            copied.next = node.next;
            node.next = copied;
            node = copied.next;
        }

        node = head;
        while (node != null) {
            if (node.random != null) node.next.random = node.random.next;
            node = node.next.next;
        }

        node = head;
        Node ret = head.next;
        while (node != null) {
            Node next = node.next.next;
            if (next != null) node.next.next = next.next;
            node.next = next;
            node = next;
        }

        return ret;
    }
}
