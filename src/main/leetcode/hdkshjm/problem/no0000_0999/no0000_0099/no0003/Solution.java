package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0003;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;

        int max = 0;
        Deque<Character> queue = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (queue.contains(c)) {
                max = Math.max(max, queue.size());
                while (queue.peek() != c) queue.poll();
                queue.poll();
            }
            queue.add(c);
        }
        max = Math.max(max, queue.size());
        return max;
    }
}
