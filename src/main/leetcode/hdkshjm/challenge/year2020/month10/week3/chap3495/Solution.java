package leetcode.hdkshjm.challenge.year2020.month10.week3.chap3495;

import java.util.*;

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        Queue<Integer> lastUsed = new PriorityQueue<>();
        int max = 0;
        for (int[] interval : intervals) {
            lastUsed.add(interval[1]);
            while (!lastUsed.isEmpty() && lastUsed.peek() <= interval[0]) lastUsed.poll();
            max = Math.max(max, lastUsed.size());
        }
        return max;
    }
}
