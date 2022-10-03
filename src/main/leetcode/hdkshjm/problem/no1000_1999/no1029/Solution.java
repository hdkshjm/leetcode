package leetcode.hdkshjm.problem.no1000_1999.no1029;

import java.util.Arrays;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (o1, o2) -> o1[0] - o2[0] - (o1[1] - o2[1]));
        int total = 0;
        int half = costs.length / 2;
        for (int i = 0; i < costs.length / 2; i++) total += costs[i][0] + costs[i + half][1];
        return total;
    }
}
