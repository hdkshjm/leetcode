package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0309;

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) return 0;
        int[] dp = new int[n];

        for (int i = 1; i < n; ++i) {
            int profit = dp[i - 1];
            for (int j = 0; j < i; j++) {
                int diff = prices[i] - prices[j];
                if (diff < 0) continue;
                if (j > 1) profit = Math.max(profit, diff + dp[j - 2]);
                else profit = Math.max(profit, diff);
            }
            dp[i] = profit;
        }
        return dp[n - 1];
    }
}
