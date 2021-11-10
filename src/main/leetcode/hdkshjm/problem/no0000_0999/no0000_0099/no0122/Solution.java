package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0122;

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) return 0;

        int profit = 0;
        int min = prices[0];
        for (int i = 0; i < n - 1; i++) {
            if (min < prices[i] && prices[i] < prices[i + 1]) continue;
            profit += Math.max(prices[i] - min, 0);
            min = prices[i];
        }
        profit += Math.max(prices[n - 1] - min, 0);
        return profit;
    }
}
