package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0382;

import leetcode.hdkshjm.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Solution {
    List<Integer> list;
    Random random;

    public Solution(ListNode head) {
        list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        random = new Random();
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
