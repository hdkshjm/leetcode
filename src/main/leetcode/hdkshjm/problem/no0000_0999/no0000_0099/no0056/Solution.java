package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, ((o1, o2) -> o1[0] - o2[0]));
        List<int[]> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (end >= intervals[i][1]) continue;
            if (end >= intervals[i][0]) {
                end = intervals[i][1];
                continue;
            }

            list.add(new int[]{start, end});
            start = intervals[i][0];
            end = intervals[i][1];
        }
        list.add(new int[]{start, end});

        return list.toArray(new int[list.size()][]);
    }
}
