package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0147;

import leetcode.hdkshjm.common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public ListNode insertionSortList(ListNode head) {
        List<ListNode> list = new ArrayList<>();

        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        Collections.sort(list, (o1, o2) -> o1.val - o2.val);
        for (int i = 0; i < list.size() - 1; i++) list.get(i).next = list.get(i + 1);
        list.get(list.size() - 1).next = null;
        return list.get(0);
    }
}
