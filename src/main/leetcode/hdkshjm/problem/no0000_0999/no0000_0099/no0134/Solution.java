package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0134;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int total = 0;

        for (int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);
            if (min > total) {
                min = total;
                minIndex = i;
            }
        }

        return total < 0 ? -1 : (minIndex + 1) % gas.length ;
    }
}
