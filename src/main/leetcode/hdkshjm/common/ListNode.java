package leetcode.hdkshjm.common;

import org.junit.jupiter.api.Assertions;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int[] values) {
        if (values.length == 0) return ;

        this.val = values[0];
        ListNode node = null;
        for (int i = 0; i < values.length - 1; i++) {
            node = new ListNode(values[values.length - 1 - i], node);
        }
        this.next = node;
    }

    public static ListNode create(int[] values) {
        if (values.length == 0) return null;

        ListNode node = null;
        for (int i = 0; i < values.length; i++) {
            node = new ListNode(values[values.length - 1 - i], node);
        }
        return node;
    }


    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void assertEquals(ListNode expected, ListNode actual) {
        if (expected != null) {
            while (actual.next != null) {
                Assertions.assertEquals(expected.val, actual.val);
                expected = expected.next;
                actual = actual.next;
            }
            Assertions.assertEquals(null, actual.next);
        } else {
            Assertions.assertEquals(expected, actual);
        }
    }
}
