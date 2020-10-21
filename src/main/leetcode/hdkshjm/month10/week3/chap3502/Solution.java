package leetcode.hdkshjm.month10.week3.chap3502;

import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (queue.isEmpty() || (queue.peekLast() < 0 && asteroids[i] < 0) || asteroids[i] > 0) {
                queue.addLast(asteroids[i]);
                continue;
            }

            while (!queue.isEmpty() &&
                    queue.peekLast() > 0 && asteroids[i] < 0 &&
                    queue.peekLast() < Math.abs(asteroids[i])) {
                queue.pollLast();
            }

            if (queue.isEmpty() || queue.peekLast() < 0 || queue.peekLast() < Math.abs(asteroids[i])) {
                queue.addLast(asteroids[i]);
                continue;
            }

            if (queue.peekLast() == Math.abs(asteroids[i])) {
                queue.pollLast();
                continue;
            }
        }

        int[] ret = new int[queue.size()];
        for (int i = 0; i < ret.length; i++) ret[i] = queue.poll();
        return ret;
    }
}