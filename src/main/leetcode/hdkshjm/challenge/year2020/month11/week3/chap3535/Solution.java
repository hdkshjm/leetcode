package leetcode.hdkshjm.challenge.year2020.month11.week3.chap3535;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        List<int[]> ret = new ArrayList<>();
        int[] current = intervals[0];
        for (int[] interval : intervals) {
            if (current[0] <= interval[0] && current[1] >= interval[0]) {
                current[1] = Math.max(current[1], interval[1]);
                continue;
            }
            ret.add(current);
            current = interval;
        }
        ret.add(current);
        return ret.toArray(new int[ret.size()][]);
    }
}
