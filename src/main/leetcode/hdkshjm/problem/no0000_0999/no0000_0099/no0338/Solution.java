package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0338;

class Solution {
    public int[] countBits(int n) {
        int[] ret = new int[n + 1];
        for (int i = 0; i <= n; i++) ret[i] = Integer.bitCount(i);
        return ret;
    }
}
