package leetcode.hdkshjm.month10.week3.chap3502;

import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        if (asteroids.length == 0) {
            return asteroids;
        }

        ArrayDeque<Integer> list = new ArrayDeque<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (list.isEmpty() || (list.peekLast() < 0 && asteroids[i] < 0) || asteroids[i] > 0) {
                list.addLast(asteroids[i]);
                continue;
            }

            while (!list.isEmpty() &&
                    list.peekLast() > 0 && asteroids[i] < 0 &&
                    list.peekLast() < Math.abs(asteroids[i])) {
                list.pollLast();
                continue;
            }

            if (list.isEmpty() || list.peekLast() < 0 || list.peekLast() < Math.abs(asteroids[i])) {
                list.addLast(asteroids[i]);
                continue;
            }

            if (list.peekLast() == Math.abs(asteroids[i])) {
                list.pollLast();
                continue;
            }
        }

        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) ret[i] = list.poll();
        return ret;
    }
}