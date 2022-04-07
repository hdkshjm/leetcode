package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1046;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) queue.add(s);
        while (queue.size() > 1) {
            int diff = queue.poll() - queue.poll();
            if (diff != 0) queue.add(diff);
        }
        return queue.size() == 1 ? queue.poll() : 0;
    }
}
