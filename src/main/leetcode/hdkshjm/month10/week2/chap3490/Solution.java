package leetcode.hdkshjm.month10.week2.chap3490;

import java.util.*;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        Arrays.sort(points, (left, right) -> (int) (((long) left[1] - (long) right[1]) >>> 1));
        int previousEnd = points[0][1];
        int num = 1;
        for (int i = 1; i < points.length; i++) {
            if (previousEnd < points[i][0]) {
                num++;
                previousEnd = points[i][1];
            }
        }
        return num;
    }
}
