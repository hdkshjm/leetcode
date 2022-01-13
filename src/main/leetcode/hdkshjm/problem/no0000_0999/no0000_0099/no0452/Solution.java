package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0452;

import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (o1, o2) -> {
            if (o1[1] < o2[1]) return -1;
            if (o1[1] > o2[1]) return 1;
            return 0;
        });

        int count = 1;
        int currentEnd = points[0][1];
        for (int[] point : points) {
            if (currentEnd < point[0]) {
                count++;
                currentEnd = point[1];
            }
        }
        return count;
    }
}
