package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0279;

import java.util.Arrays;

class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        int max = (int) Math.sqrt(n);
        int[] squares = new int[max];
        for (int j = 0; j < max; j++) squares[j] = (int) Math.pow(j + 1, 2);

        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j < max; ++j) {
                if (i < squares[j])
                    break;
                dp[i] = Math.min(dp[i], dp[i - squares[j]] + 1);
            }
        }
        return dp[n];
    }
}
