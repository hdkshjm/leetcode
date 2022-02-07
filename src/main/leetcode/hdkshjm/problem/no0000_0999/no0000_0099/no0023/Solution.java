package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0023;

import leetcode.hdkshjm.common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> ret = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode node = lists[i];
            while (node != null) {
                ret.add(node);
                node = node.next;
            }
        }
        if (ret.isEmpty()) return null;

        Collections.sort(ret, (o1, o2) -> o1.val - o2.val);
        for (int i = 0; i < ret.size() - 1; i++) ret.get(i).next = ret.get(i + 1);
        ret.get(ret.size() - 1).next = null;
        return ret.get(0);
    }
}
