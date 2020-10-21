package leetcode.hdkshjm.month10.week3.chap3502;

import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int asteroid : asteroids) {
            if (queue.isEmpty() || (queue.peekLast() < 0 && asteroid < 0) || asteroid > 0) {
                queue.addLast(asteroid);
                continue;
            }

            while (!queue.isEmpty() &&
                    queue.peekLast() > 0 && asteroid < 0 &&
                    queue.peekLast() < Math.abs(asteroid)) {
                queue.pollLast();
            }

            if (queue.isEmpty() || queue.peekLast() < 0 || queue.peekLast() < Math.abs(asteroid)) {
                queue.addLast(asteroid);
                continue;
            }

            if (queue.peekLast() == Math.abs(asteroid)) {
                queue.pollLast();
            }
        }
        return queue.stream().mapToInt(i -> i).toArray();
    }
}