package leetcode.hdkshjm.month10.week3.chap3495;

import java.util.*;

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length < 2) {
            return intervals.length;
        }

        Arrays.sort(intervals, (left, right) -> {
            if (left[0] > right[0]) return 1;
            if (left[0] == right[0]) return 0;
            return -1;
        });

        List<Integer> lastUsed = new ArrayList<Integer>();
        lastUsed.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            for (int j = 0; j < lastUsed.size(); j++) {
                if (lastUsed.get(j) <= intervals[i][0]) {
                    lastUsed.remove(j);
                    break;
                }
            }
            lastUsed.add(intervals[i][1]);
        }
        return lastUsed.size();
    }
}
