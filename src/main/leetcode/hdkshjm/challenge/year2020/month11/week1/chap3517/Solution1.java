package leetcode.hdkshjm.challenge.year2020.month11.week1.chap3517;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//Runtime: 9 ms
//Memory Usage: 39.2 MB
class Solution1 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        Map<Integer, List<ListNode>> map = new TreeMap<>();

        while (head != null) {
            List list = map.getOrDefault(head.val, new ArrayList<>());
            list.add(head);
            map.put(head.val, list);
            head = head.next;
        }

        ListNode newHead = null;
        ListNode previous = null;
        for (List<ListNode> list : map.values()) {
            for (ListNode next : list) {
                if (previous == null) {
                    newHead = next;
                } else {
                    previous.next = next;
                }
                previous = next;
            }
        }
        previous.next = null;
        return newHead;
    }
}
