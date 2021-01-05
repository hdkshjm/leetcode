package leetcode.hdkshjm.challenge.year2020.month11.week1.chap3515;

import java.util.Arrays;

class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals.length == 0) return true;

        Arrays.sort(intervals, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        int[] previous = new int[]{intervals[0][0] - 2, intervals[0][0] - 1};
        for (int[] interval : intervals) {
            if( previous[1] > interval[0] ) return false;
            previous = interval;
        }
        return true;
    }
}
