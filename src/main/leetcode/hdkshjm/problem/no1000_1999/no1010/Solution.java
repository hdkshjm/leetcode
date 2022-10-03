package leetcode.hdkshjm.problem.no1000_1999.no1010;

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] counts = new int[61];
        for (int t : time) counts[t % 60]++;
        int total = 0;
        if (counts[0] > 0) total += counts[0] * (counts[0] - 1) / 2;
        if (counts[30] > 0) total += counts[30] * (counts[30] - 1) / 2;
        for (int i = 1; i < 30; i++) total += counts[i] * counts[60 - i];
        return total;
    }
}
