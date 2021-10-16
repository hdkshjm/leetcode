package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0123;

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) return 0;

        int min = prices[0];
        int max = prices[n - 1];
        int[] leftProfits = new int[n];
        int[] rightProfits = new int[n];

        for (int i = 1; i < n; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[n - 1 - i]);
            leftProfits[i] = Math.max(leftProfits[i - 1], prices[i] - min);
            rightProfits[n - 1 - i] = Math.max(rightProfits[n - i], max - prices[n - 1 - i]);
        }

        int profit = 0;
        for (int i = 0; i < n; i++) {
            profit = Math.max(profit, leftProfits[i] + rightProfits[i]);
        }
        return profit;
    }
}
