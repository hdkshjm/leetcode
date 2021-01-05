package leetcode.hdkshjm.challenge.year2020.month11.week1.chap3517;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Runtime: 3 ms
//Memory Usage: 38.6 MB
class SolutionBinarySearch {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        Comparator<ListNode> comparator = new Comparator<ListNode>() {
            public int compare(ListNode left, ListNode right) {
                return left.val - right.val;
            }
        };

        List<ListNode> nodes = new ArrayList<>();
        nodes.add(head);
        ListNode input = head.next;
        while (input != null) {
            int index = Collections.binarySearch(nodes, input, comparator);
            index = (index >= 0) ? index : ~index;
            nodes.add(index, input);
            input = input.next;
        }

        ListNode previous = null;
        for (ListNode node : nodes) {
            if (previous == null) {
                previous = node;
                continue;
            }
            previous.next = node;
            previous = node;
        }
        previous.next = null;
        return nodes.get(0);
    }
}
