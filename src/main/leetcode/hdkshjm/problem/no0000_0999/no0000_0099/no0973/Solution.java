package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0973;

import java.util.Arrays;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (o1, o2) -> {
            return o1[0] * o1[0] + o1[1] * o1[1] - o2[0] * o2[0] - o2[1] * o2[1];
        });
        int[][] ret = new int[k][];
        for (int i = 0; i < k; i++) ret[i] = points[i];
        return ret;
    }
}
