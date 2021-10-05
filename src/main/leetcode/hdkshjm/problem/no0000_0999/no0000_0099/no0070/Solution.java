package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0070;

class Solution {
    public int climbStairs(int n) {
        int ret = 0;
        for (int i = n; i >= n / 2; i--) {
            int c = (int) calcCombination(i, n - i);
            ret += calcCombination(i, n - i);
        }
        return ret;
    }

    private static long calcCombination(int n, int r) {
        if (r == 0) return 1;
        if (r == 1) return n;
        return calcCombination(n - 1, r - 1) * n / r;
    }
}
