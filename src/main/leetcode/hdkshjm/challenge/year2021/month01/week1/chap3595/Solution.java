package leetcode.hdkshjm.challenge.year2021.month01.week1.chap3595;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Deque<Character> queue = new ArrayDeque<>();
        int max = 0;
        for (char c : s.toCharArray()) {
            if (queue.contains(c)) {
                while (queue.peekFirst() != c) queue.pollFirst();
                queue.pollFirst();
            }
            queue.add(c);
            max = Math.max(max, queue.size());
        }

        return max;
    }
}
