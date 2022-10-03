package leetcode.hdkshjm.problem.no1000_1999.no1288;

import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] == o2[0]) return o2[1] - o1[1];
            return o1[0] - o2[0];
        });

        int count = intervals.length;
        int[] previous = new int[]{intervals[0][0] - 2, intervals[0][0] - 1};
        for (int[] interval : intervals) {
            if (previous[0] <= interval[0] && interval[1] <= previous[1]) count--;
            else previous = interval;
        }

        return count;
    }
}
